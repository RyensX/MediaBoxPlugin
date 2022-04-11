package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 标签流视图组件数据
 */
class TagFlowData(val tagList: List<TagData>) : BaseData() {
    override var paddingTop: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}