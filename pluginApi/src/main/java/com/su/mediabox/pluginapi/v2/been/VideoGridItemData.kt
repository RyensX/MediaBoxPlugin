package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 视频网格子项视图组件数据
 * @param other 剧集信息等
 */
class VideoGridItemData(
    val name: String,
    val coverUrl: String,
    val url: String,
    val other: String = ""
) : BaseData() {

    override var spanSize: Int = 2

    override var paddingLeft: Int = 0.dp
    override var paddingTop: Int = 0.dp
    override var paddingRight: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}