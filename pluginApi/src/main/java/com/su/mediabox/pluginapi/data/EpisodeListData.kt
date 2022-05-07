package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 剧集列表视图组件数据
 */
data class EpisodeListData(
    val playList: List<EpisodeData>
) : BaseData() {
    override var paddingTop: Int = 0.dp
    override var paddingRight: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}