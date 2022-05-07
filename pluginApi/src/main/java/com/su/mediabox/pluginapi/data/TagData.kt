package com.su.mediabox.pluginapi.data

import android.graphics.Color
import android.view.Gravity

/**
 * 标签视图组件数据
 * @param tagColor 标签整体颜色，建议用[Color.parseColor]解析，默认null，即使用主题色
 */
data class TagData(val name: String, val tagColor: Int? = null) : TextData() {
    override var fontColor: Int? = Color.WHITE
    override var fontSize = 11F
    override var gravity = Gravity.CENTER

    override var paddingLeft = 0
    override var paddingTop = 0
    override var paddingRight = 0
    override var paddingBottom = 0
}