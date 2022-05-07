package com.su.mediabox.pluginapi.util

import java.lang.StringBuilder
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.regex.Matcher
import java.util.regex.Pattern

object TextUtil {

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