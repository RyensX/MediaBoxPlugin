package com.su.mediabox.pluginapi.v2.been

/**
 * 视频（作品）信息
 */
abstract class VideoData(
    val name: String,
    val coverUrl: String,
    val url: String
) : BaseData()