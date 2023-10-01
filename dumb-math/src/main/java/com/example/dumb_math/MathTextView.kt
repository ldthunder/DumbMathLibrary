package com.example.dumb_math

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MathTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): AppCompatTextView(context, attrs, defStyleAttr){

    @SuppressLint("SetTextI18n")
    override fun performClick(): Boolean {
        text = """Пупупипу:
            |${Mathrix.xThree(Mathrix.randomlyBuffed(1))}""".trimMargin()
        return super.performClick()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        performClick()
        return super.onTouchEvent(event)
    }

}