package com.su.mediabox.pluginapi.v2.been

/**
 * 封面样式一视图组件数据
 *
 * 可显示封面和处于封面左上角的评分
 */
data class VideoCover1Data(
    var coverUrl: String,
    var score: Float = -1F//-1表示不显示评分
) : BaseData()