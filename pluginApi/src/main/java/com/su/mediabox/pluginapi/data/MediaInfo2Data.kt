package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 媒体信息样式2视图组件数据
 */
data class MediaInfo2Data(
    val name: String,
    val coverUrl: String,
    val url: String,
    val episodeInfo: String,
    val desc: String,
    val tagList: List<TagData>? = null,
    //val customData: List<BaseData>? = null
) : BaseData(){
    override var paddingTop: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}