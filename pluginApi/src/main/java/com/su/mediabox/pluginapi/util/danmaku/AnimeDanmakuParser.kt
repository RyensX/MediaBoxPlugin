package com.su.mediabox.pluginapi.util.danmaku

import android.graphics.Color
import com.kuaishou.akdanmaku.data.DanmakuItemData
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*
import kotlin.collections.ArrayList

/**
 * 辅助解析弹幕
 *
 * 可能需要重新设计
 */
class AnimeDanmakuParser(private var data: String) {

    fun parse(): List<DanmakuItemData> {
        if (data.isBlank()) return ArrayList()
        val jsonArray: JSONArray
        JSONObject(data).apply {
            jsonArray = getJSONArray("danmuku")
        }
        val dataList: MutableList<DanmakuItemData> = ArrayList(jsonArray.length())
        for (i in 0 until jsonArray.length()) {
            try {
                val array = jsonArray.getJSONArray(i)
                val content = array.getString(4)
                var textSize = 27
                if (array.length() >= 8) {
                    textSize = array.getString(7).replace("px", "").toInt()
                }
                dataList.add(
                    DanmakuItemData(
                        content = content,
                        danmakuId = i.toLong(),
                        textSize = textSize,
                        textColor = getColor(array.getString(2)),
                        position = (array.getDouble(0) * 1000).toLong(),
                        mode = getType(array.getString(1))
                    )
                )
            } catch (e: JSONException) {
                e.printStackTrace()
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            }
        }
        return dataList
    }

    companion object {
        fun getColor(s: String): Int {
            val strColor = s.toLowerCase(Locale.ROOT)
            try {
                if (strColor.startsWith("#")) {
                    Color.parseColor(s)
                } else if (strColor.startsWith("rgb")) {
                    val rgbArray = strColor.replace("rgb(", "")
                        .replace(")", "").split(",")
                    if (rgbArray.size == 3) Color.rgb(
                        rgbArray[0].trim().toInt(),
                        rgbArray[1].trim().toInt(),
                        rgbArray[2].trim().toInt()
                    )
                }
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
            }
            return Color.WHITE
        }
    }

    private fun getType(s: String): Int {
        return when (s) {
            "top" -> DanmakuItemData.DANMAKU_MODE_CENTER_TOP
            else -> DanmakuItemData.DANMAKU_MODE_ROLLING
        }
    }
}