package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.Constant
import com.su.mediabox.pluginapi.v2.action.Action

/**
 * V2版API的数据基类，包含一个Action

 */
abstract class BaseData {
    var action: Action? = null

    /**
     * 参考[GridLayoutManager]使用，在被包含在[GridData]时有效
     */
    open var spanSize: Int = Constant.DEFAULT_SPAN_SIZE
}