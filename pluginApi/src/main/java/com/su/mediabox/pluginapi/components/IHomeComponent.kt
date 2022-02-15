package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.TabBean

/**
 * 获取首页数据组件
 */
interface IHomeComponent : IBaseComponent {
    /**
     * 获取首页上方Tab数据
     *
     * @return ArrayList，不可为null。所有Tab的ArrayList
     */
    suspend fun getAllTabData(): List<TabBean>

}