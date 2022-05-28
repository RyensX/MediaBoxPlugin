package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.Constant
import com.su.mediabox.pluginapi.action.Action
import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * V2版API的数据基类

 */
abstract class BaseData {
    /**
     * 数据动作
     */
    var action: Action? = null

    /**
     * 布局配置，默认不设置，如果有需要最好只设置在第一个数据上，用于控制数据集列表整体布局
     *
     * 注意！！！这会导致数据所在整个列表布局发生变化，请谨慎使用
     */
    var layoutConfig: LayoutConfig? = null

    /**
     * 参考[GridLayoutManager]使用
     */
    open var spanSize: Int = Constant.DEFAULT_SPAN_SIZE

    open var paddingTop: Int = 0.dp
    open var paddingBottom: Int = 0.dp
    open var paddingLeft: Int = 0.dp
    open var paddingRight: Int = 0.dp

    /**
     * @param spanCount 与[GridLayoutManager]中的spanCount用法一致
     * @param itemSpacing 项分隔空间
     */
    data class LayoutConfig(
        val spanCount: Int = Constant.DEFAULT_SPAN_COUNT,
        val itemSpacing: Int = 8.dp
    ) {
        @Deprecated("兼容处理，会逐步删除，请尽快更新API")
        constructor(
            spanCount: Int = Constant.DEFAULT_SPAN_COUNT,
            itemSpacing: Int = 8.dp,
            listLeftEdge: Int = itemSpacing,
            listRightEdge: Int = itemSpacing,
        ) : this(spanCount, itemSpacing)
    }
}