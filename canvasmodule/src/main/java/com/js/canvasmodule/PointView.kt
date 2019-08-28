package com.js.canvasmodule

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.util.AttributeSet
import android.view.View

class PointView @JvmOverloads  constructor(context: Context, attrs: AttributeSet? = null, defStyleInt: Int = 0) :
    View(context, attrs) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var point = Point(0,0)
        set(value) {
            invalidate()
            field = value
        }
    init {
        paint.color = Color.RED
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 15f.dp2px()
        paint.strokeCap = Paint.Cap.ROUND
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawPoint(point.x.toFloat(),point.y.toFloat(),paint)
    }
}