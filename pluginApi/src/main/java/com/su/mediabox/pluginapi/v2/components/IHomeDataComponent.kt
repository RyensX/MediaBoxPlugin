package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.been.BaseData

/**
 * 首页数据组件
 */
interface IHomeDataComponent : IBaseComponent {
    /**
     * 获取数据
     * @param page 由宿主控制的页码，在刷新时重置，在上拉时递增
     */
    suspend fun getData(page: Int): List<BaseData>?
}