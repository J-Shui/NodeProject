package com.js.canvasmodule

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class DrawableView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleInt: Int = 0) :
    View(context, attrs) {
    private val drawable = CustomDrawable()
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        drawable.setBounds(100f.dp2px().toInt(),200f.dp2px().toInt(),400f.dp2px().toInt(),400f.dp2px().toInt())
        drawable.draw(canvas!!)
    }
}