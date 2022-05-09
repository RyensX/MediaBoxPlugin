package com.su.mediabox.pluginapi.data

import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity

/**
 * 文本视图组件数据基类
 */
abstract class TextData : BaseData() {
    /**
     * 单位SP
     */
    open var fontSize: Float = 15F

    /**
     * 颜色值,建议用[Color.parseColor]解析，默认null，即使用主题色
     */
    open var fontColor: Int? = null

    /**
     * 取Typeface内 Style的值，如[Typeface.BOLD]
     */
    open var fontStyle: Int = 0

    /**
     * 取[android.view.Gravity]内的值
     */
    open var gravity: Int = Gravity.START
}