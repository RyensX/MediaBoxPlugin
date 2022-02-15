package com.su.mediabox.pluginapi.components


import com.su.mediabox.pluginapi.been.IAnimeDetailBean

/**
 * 获取番剧详情数据组件
 */
interface IAnimeDetailComponent : IBaseComponent {
    /**
     * 获取番剧详情页数据
     *
     * @param partUrl  页面部分url
     * @return Triple
     * String：番剧封面
     * String：番剧名
     * ArrayList<IAnimeDetailBean>：详情页数据List
     */
    suspend fun getAnimeDetailData(partUrl: String): Triple<String, String, List<IAnimeDetailBean>>

}