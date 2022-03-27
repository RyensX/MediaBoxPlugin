package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.v2.action.Action

/**
 * V2版API的数据基类，包含一个Action
 *
 * 视图组件默认均为垂直线性视图组件
 */
abstract class BaseData {
    var action: Action? = null
}