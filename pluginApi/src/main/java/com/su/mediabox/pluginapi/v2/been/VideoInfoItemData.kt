package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 视频信息子项视图组件数据
 */
class VideoInfoItemData(
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