package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.IAnimeShowBean
import com.su.mediabox.pluginapi.been.PageNumberBean

/**
 * 获取首页每个Tab下方内容的数据组件
 */
interface IAnimeShowComponent : IBaseComponent {
    /**
     * 获取首页某一个Tab下的内容
     *
     * @param partUrl  页面部分url
     * @return Pair
     * ArrayList<IAnimeShowBean>：数据List
     * PageNumberBean：下一页数据地址Bean，null则表示没有下一页
     */
    suspend fun getAnimeShowData(partUrl: String): Pair<List<IAnimeShowBean>, PageNumberBean?>
}