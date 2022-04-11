package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 网格视图组件
 * @param spanCount 参考[GridLayoutManager]使用
 */
class GridData(
    val gridItemList: List<BaseData>,
    val spanCount: Int = 4
) : BaseData() {
    override var paddingTop: Int = 0.dp
    override var paddingBottom: Int = 0.dp
}