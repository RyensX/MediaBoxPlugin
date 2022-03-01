package com.su.mediabox.pluginapi

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import java.lang.StringBuilder
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.regex.Matcher
import java.util.regex.Pattern

object Text {

    fun String.urlDecode() = URLDecoder.decode(this, "UTF-8")

    fun String.urlEncode() = URLEncoder.encode(this, "UTF-8")

    fun buildRouteActionUrl(action: String, vararg params: String): String {
        return StringBuilder(action.removeSuffix("/")).run {
            params.forEach {
                append("/")
                append(it.urlEncode())
            }
            toString()
        }
    }

    fun String.getSubString(s: String, e: String): List<String> {
        val regex = "$s(.*?)$e"
        val p: Pattern = Pattern.compile(regex)
        val m: Matcher = p.matcher(this)
        val list: MutableList<String> = ArrayList()
        while (m.find()) {
            list.add(m.group(1))
        }
        return list
    }
}

object UI {
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