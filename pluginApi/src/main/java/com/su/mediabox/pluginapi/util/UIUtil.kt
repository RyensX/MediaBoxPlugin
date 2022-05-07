package com.su.mediabox.pluginapi.util

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast

object UIUtil {
    fun CharSequence.toast(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(AppUtil.appContext, this, duration).show()
    }

    val Float.dp: Float
        get() = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            this,
            Resources.getSystem().displayMetrics
        )

    val Int.dp: Int
        get() = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            this.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()

    val Float.sp: Float                 // [xxhdpi](360 -> 1080)
        get() = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            this,
            Resources.getSystem().displayMetrics
        )

    val Int.sp: Int
        get() = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            this.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()
}