package com.su.mediabox.pluginapi.data

import android.graphics.Color
import android.view.Gravity
import android.widget.ImageView.ScaleType
import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 媒体信息样式1视图组件数据
 * @param other 剧集信息等
 * @param nameColor/otherColor 默认null使用主题色
 * @param gravity name和other等可显示文本的gravity
 */
data class MediaInfo1Data(
    val name: String,
    val coverUrl: String,
    val url: String,
    val other: String = "",
    val other2: String = "",
    val nameColor: Int? = Color.BLACK,
    val otherColor: Int? = null,
    val coverScaleType: ScaleType = ScaleType.CENTER_CROP,
    val coverHeight: Int = 150.dp,
    val gravity: Int = Gravity.START
) : BaseData() {

    override var spanSize: Int = 2

    override var paddingLeft: Int = 0.dp
    override var paddingTop: Int = 0.dp
    override var paddingRight: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}