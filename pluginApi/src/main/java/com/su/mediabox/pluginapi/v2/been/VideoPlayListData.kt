package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 播放列表视图组件数据
 */
data class VideoPlayListData(
    val playList: List<EpisodeData>
) : BaseData(){
    override var paddingTop: Int = 0.dp
    override var paddingRight: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}