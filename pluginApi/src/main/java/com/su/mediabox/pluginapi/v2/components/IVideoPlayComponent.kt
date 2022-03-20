package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.been.AnimeEpisodeDataBean
import com.su.mediabox.pluginapi.been.IAnimeDetailBean
import com.su.mediabox.pluginapi.been.PlayBean
import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.been.VideoPlayMedia

/**
 * 获取播放界面数据组件
 */
interface IVideoPlayComponent : IBaseComponent {

    /**
     * 获取弹幕数据，包括弹幕地址和发送弹幕参数。显示弹幕需重写此方法，否则无需重写
     *
     * @return Pair<弹幕地址,弹幕参数>
     */
    suspend fun getDanmakuData(episodeUrl: String): Pair<String, Map<String, String>?>? = null

    /**
     * 获取播放页面相关数据
     */
    suspend fun getVideoPlayMedia(episodeUrl: String): VideoPlayMedia

}