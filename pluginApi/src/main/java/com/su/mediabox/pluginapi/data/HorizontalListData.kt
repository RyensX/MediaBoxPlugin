package com.su.mediabox.pluginapi.data

import android.view.ViewGroup
import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 水平列表视图组件数据
 * @param widthLimit 宽度限制，可设置dp和[ViewGroup.LayoutParams.MATCH_PARENT]等
 */
class HorizontalListData @JvmOverloads constructor(
    val listData: List<BaseData>,
    val itemWidthLimit: Int = 128.dp
) : BaseData()