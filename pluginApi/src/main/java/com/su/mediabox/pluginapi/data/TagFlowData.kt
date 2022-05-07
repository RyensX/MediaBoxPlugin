package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 标签流视图组件数据
 */
data class TagFlowData(val tagList: List<TagData>) : BaseData() {
    override var paddingTop: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}