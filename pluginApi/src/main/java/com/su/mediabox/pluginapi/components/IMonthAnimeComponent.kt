package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeCoverBean
import com.su.mediabox.pluginapi.been.PageNumberBean

/**
 * 获取季度番剧数据组件
 */
interface IMonthAnimeComponent : IBaseComponent {
    /**
     * @param partUrl  页面部分url，不为null
     * @return Pair，不可为null
     * ArrayList<AnimeCoverBean>：季度番剧数据ArrayList，不为null；
     * PageNumberBean：下一页数据地址，可为null，为空则没有下一页
     */
    suspend fun getMonthAnimeData(partUrl: String): Pair<List<AnimeCoverBean>, PageNumberBean?>
}