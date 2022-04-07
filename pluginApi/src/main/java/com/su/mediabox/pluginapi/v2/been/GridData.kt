package com.su.mediabox.pluginapi.v2.been

/**
 * 网格视图组件
 * @param spanCount 参考[GridLayoutManager]使用
 */
class GridData(
    val gridItemList: List<BaseData>,
    val spanCount: Int = 4
) : BaseData()