package com.su.mediabox.pluginapi.v2.been

/**
 * @param other 剧集信息等
 */
class VideoGridItemData(
    name: String,
    coverUrl: String,
    url: String,
    val other: String = ""
) : VideoData(name, coverUrl, url)