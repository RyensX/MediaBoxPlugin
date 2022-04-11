package com.su.mediabox.pluginapi.v2.been

import android.graphics.Typeface
import android.view.Gravity
import com.su.mediabox.pluginapi.UI.dp

/**
 * 文本视图组件数据
 */
data class TextData(
    val text: String,
    /**
     * 单位SP
     */
    val fontSize: Float = 15F,
    /**
     * 0xAARRGGBB 形式的颜色值，默认null，即使用主题色
     */
    val fontColor: Int? = null,
    /**
     * 取Typeface内 Style的值，如[Typeface.BOLD]
     */
    val fontStyle: Int = 0,
    /**
     * 取[android.view.Gravity]内的值
     */
    val gravity: Int = Gravity.LEFT
) : BaseData()