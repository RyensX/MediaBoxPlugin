package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.data.BaseData

/**
 * 首页页面数据组件
 */
interface IHomePageDataComponent : IBasePageDataComponent {
    /**
     * 获取数据
     * @param page 由宿主控制的页码，在刷新时重置，在上拉时递增
     */
    suspend fun getData(page: Int): List<BaseData>?
}