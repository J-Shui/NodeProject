package com.js.canvasmodule

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.TypeEvaluator
import android.graphics.Point
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bottom = ObjectAnimator.ofFloat(view,"rotateBottom",0f,45f)
//        bottom.duration = 1000
//
//        val rotate = ObjectAnimator.ofFloat(view,"rotate",0f,270f)
//        rotate.duration = 2000
//
//        val top = ObjectAnimator.ofFloat(view,"rotateTop",0f,-45f)
//        top.duration = 1000
//
//        val set = AnimatorSet()
//        set.playSequentially(bottom,rotate,top)
//        set.start()
        val target = Point(200f.dp2px().toInt(),300f.dp2px().toInt())
//        val point = ObjectAnimator.ofObject(view,"point",
//            TypeEvaluator<Point> { fraction, startValue, endValue ->
//                // value = fraction * (end - start) + start
//                Point(startValue.x + (fraction * (endValue.x - startValue.x)).toInt(),
//                    (startValue.y + fraction * (endValue.y - startValue.y)).toInt())
//            },target)
//        point.duration = 2000
//        point.start()
    }

}
