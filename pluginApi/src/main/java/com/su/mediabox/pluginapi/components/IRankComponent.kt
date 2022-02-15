package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.TabBean

/**
 * 获取排行榜界面每个Tab详细数据组件
 */
interface IRankComponent : IBaseComponent {
    /**
     * 获取排行榜Tab数据
     *
     * @return ArrayList，不可为null。排行榜TabArrayList
     */
    suspend fun getRankTabData(): List<TabBean>
}