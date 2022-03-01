package com.su.mediabox.pluginapi.v2.been

/**
 * @param other 剧集信息等
 */
class VideoGridItemData(
    val name: String,
    val coverUrl: String,
    val url: String,
    val other: String = ""
) : BaseData()