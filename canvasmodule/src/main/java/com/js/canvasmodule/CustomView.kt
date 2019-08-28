package com.js.canvasmodule

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Camera
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleInt: Int = 0) :
    View(context, attrs) {


    private val WIDTH = 200f.dp2px().toInt()
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var bitmap: Bitmap = context.getAvatar(WIDTH)

    private val camera = Camera()

    var rotate = 0f
        set(value) {
            invalidate()
            field = value
        }
    var rotateTop = 0f
        set(value) {
            invalidate()
            field = value
        }
    var rotateBottom = 0f
        set(value) {
            invalidate()
            field = value
        }
    init {
        setLayerType(LAYER_TYPE_HARDWARE,null)
        setLayerType(LAYER_TYPE_SOFTWARE,null)
        setLayerType(LAYER_TYPE_NONE, null)
        camera.setLocation(0f, 0f, -6 * resources.displayMetrics.density)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //下半部分
        canvas?.save()
        canvas?.translate((WIDTH / 2 + 100f.dp2px()), (WIDTH / 2 + 100f.dp2px()))
        canvas?.rotate(-rotate)
        camera.save()
        camera.rotateX(rotateBottom)
        camera.applyToCanvas(canvas)
        camera.restore()
        canvas?.clipRect(-WIDTH, 0, WIDTH, WIDTH)
        canvas?.rotate(rotate)
        canvas?.translate(-(WIDTH / 2 + 100f.dp2px()), -(WIDTH / 2 + 100f.dp2px()))
        canvas?.drawBitmap(bitmap, 100f.dp2px(), 100f.dp2px(), paint)
        canvas?.restore()

        //上半部分
        canvas?.save()
        canvas?.translate((WIDTH / 2 + 100f.dp2px()), (WIDTH / 2 + 100f.dp2px()))
        canvas?.rotate(-rotate)
        camera.save()
        camera.rotateX(rotateTop)
        camera.applyToCanvas(canvas)
        camera.restore()
        canvas?.clipRect(-WIDTH, -WIDTH, WIDTH, 0)
        canvas?.rotate(rotate)
        canvas?.translate(-(WIDTH / 2 + 100f.dp2px()), -(WIDTH / 2 + 100f.dp2px()))
        canvas?.drawBitmap(bitmap, 100f.dp2px(), 100f.dp2px(), paint)
        canvas?.restore()
    }

}