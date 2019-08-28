package com.js.canvasmodule

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.TypedValue

fun Float.dp2px() : Float = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,this, Resources.getSystem().displayMetrics)

fun Context.getAvatar(width : Int) : Bitmap{
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeResource(resources,R.drawable.avatar,options)
    options.inJustDecodeBounds = false
    options.inDensity = options.outWidth
    options.inTargetDensity = width
    return BitmapFactory.decodeResource(resources,R.drawable.avatar,options)
}