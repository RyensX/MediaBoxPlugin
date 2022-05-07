package com.su.mediabox.pluginapi.data

/**
 * 封面样式1视图组件数据
 *
 * 可显示封面和处于封面左上角的评分
 */
data class Cover1Data(
    var coverUrl: String,
    var score: Float = -1F//-1表示不显示评分
) : BaseData()