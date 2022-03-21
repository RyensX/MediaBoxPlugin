package com.su.mediabox.pluginapi.v2.been

/**
 * 视频网格子项视图组件数据
 * @param other 剧集信息等
 */
class VideoGridItemData(
    val name: String,
    val coverUrl: String,
    val url: String,
    val other: String = ""
) : GridItemData()