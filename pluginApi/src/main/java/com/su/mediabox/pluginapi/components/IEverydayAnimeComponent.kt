package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeCoverBean
import com.su.mediabox.pluginapi.been.AnimeShowBean
import com.su.mediabox.pluginapi.been.TabBean

/**
 * 获取每日更新番剧界面数据组件
 */
interface IEverydayAnimeComponent : IBaseComponent {
    /**
     * 获取每日更新动漫数据
     *
     * @return Triple
     * List<TabBean>：Tab信息
     * List<List<AnimeCoverBean>>：每个Tab下的数据
     * String：顶部标题
     */
    suspend fun getEverydayAnimeData(): Triple<List<TabBean>, List<List<AnimeCoverBean>>, String>

}