package com.js.canvasmodule

import android.graphics.*
import android.graphics.drawable.Drawable

class CustomDrawable : Drawable(){
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val PADDING = 20f.dp2px()
    init {
        paint.color = Color.RED
        paint.strokeWidth = 2f.dp2px()
        bgPaint.color = Color.GRAY
    }
    override fun draw(canvas: Canvas) {
//        canvas.drawRect(bounds.left.toFloat(),bounds.top.toFloat(),bounds.right.toFloat(),bounds.bottom.toFloat(),bgPaint)
        for (i in bounds.left..bounds.right step PADDING.toInt()){
            for (j in bounds.top..bounds.bottom step  PADDING.toInt()){
                canvas.drawLine(bounds.left.toFloat(),j.toFloat(),bounds.right.toFloat(),j.toFloat(),paint)
                canvas.drawLine(i.toFloat(),bounds.top.toFloat(),i.toFloat(),bounds.bottom.toFloat(),paint)

            }

        }

    }

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
    }

    override fun getOpacity(): Int {
        return when(paint.alpha){
            0 -> {
                PixelFormat.TRANSPARENT
            }
            0xff -> {
                PixelFormat.OPAQUE
            }
            else -> PixelFormat.TRANSLUCENT
        }
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
    }

}