package com.su.mediabox.pluginapi.v2.been

import android.graphics.Color
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
     * 0xAARRGGBB 形式的颜色值
     */
    val fontColor: Int = Color.WHITE,
    /**
     * 取[android.view.Gravity]内的值
     */
    val fontStyle: Int = 0,
    val gravity: Int = Gravity.LEFT,
    val paddingTop: Int = 12.dp,
    val paddingBottom: Int = 8.dp
) : BaseData()