package com.su.mediabox.pluginapi.v2.been

/**
 * 网格子项视图组件，继承该类的视图组件均为网格视图组件
 * @param spanSize 参考[GridLayoutManager]使用
 */
abstract class GridItemData(
    var spanSize: Int = DEFAULT_SPAN_SIZE
) : BaseData() {
    companion object {
        const val DEFAULT_SPAN_SIZE = 1
    }
}