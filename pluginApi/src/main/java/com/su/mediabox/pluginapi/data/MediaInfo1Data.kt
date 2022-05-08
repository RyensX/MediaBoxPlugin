package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 媒体信息样式1视图组件数据
 * @param other 剧集信息等
 * @param otherColor 默认-1使用主题色
 */
data class MediaInfo1Data(
    val name: String,
    val coverUrl: String,
    val url: String,
    val other: String = "",
    val otherColor: Int = -1,
    val coverHeight: Int = 150.dp
) : BaseData() {

    override var spanSize: Int = 2

    override var paddingLeft: Int = 0.dp
    override var paddingTop: Int = 0.dp
    override var paddingRight: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}