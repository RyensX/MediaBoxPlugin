package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeEpisodeDataBean
import com.su.mediabox.pluginapi.been.IAnimeDetailBean
import com.su.mediabox.pluginapi.been.PlayBean

/**
 * 获取播放界面数据组件
 */
interface IPlayComponent : IBaseComponent {

    /**
     * 暂未使用
     *
     * 获取弹幕数据，包括弹幕地址和发送弹幕参数。显示弹幕需重写此方法，否则无需重写
     *
     * @return HashMap<弹幕地址, 发送参数>，可为null
     */
    suspend fun getDanmakuData(): Map<String, String>? {
        return null
    }

    /**
     * 获取播放页面相关数据
     *
     * @param partUrl              页面相对url
     * @param animeEpisodeDataBean 此集番剧数据，直接对此引用进行数据设置，不要更改此变量指向的对象
     * @return Triple，不可为null
     * List<IAnimeDetailBean>：播放页下方数据项，可自定义
     * List<AnimeEpisodeDataBean>：番剧集数列表
     * PlayBean：此集番剧数据
     */
    suspend fun getPlayData(
        partUrl: String,
        animeEpisodeDataBean: AnimeEpisodeDataBean
    ): Triple<ArrayList<IAnimeDetailBean>, List<AnimeEpisodeDataBean>, PlayBean>

    /**
     * 获取当前页面播放视频的地址
     *
     * @param partUrl  页面相对url
     * @return String，此页面播放的视频地址
     */
    suspend fun getAnimeEpisodeUrlData(partUrl: String): String?

    /**
     * 获取传入partUrl页面对应的视频的数据
     *
     * @param partUrl              页面相对url
     * @param animeEpisodeDataBean partUrl页面对应的视频的数据Bean，直接对此变量设置数据，不要更改此变量指向的对象
     * @return 成功t与否
     */
    suspend fun refreshAnimeEpisodeData(
        partUrl: String,
        animeEpisodeDataBean: AnimeEpisodeDataBean
    ): Boolean

}