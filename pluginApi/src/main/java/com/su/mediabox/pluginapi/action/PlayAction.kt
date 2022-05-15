package com.su.mediabox.pluginapi.action

import android.content.Context

/**
 * @param playerManager 自定义解码器(Icom.shuyu.gsyvideoplayer.player.PlayerManager)，为空则使用默认的
 */
class PlayAction private constructor(
    val episodeUrl: String,
    var coverUrl: String,
    var detailPartUrl: String,
    var videoName: String,
    var playerManager: Class<*>? = null
) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: PlayAction.(Context) -> Unit

        fun obtain(
            episodeUrl: String,
            coverUrl: String = "",
            detailPartUrl: String = "",
            videoName: String = ""
        ) = obtain(episodeUrl, coverUrl, detailPartUrl, videoName, null)

        /**
         * @param episodeUrl 剧集链接，插件只需要提供此参数，其余数据由宿主自动填入
         */
        fun obtain(
            episodeUrl: String,
            coverUrl: String = "",
            detailPartUrl: String = "",
            videoName: String = "",
            playerManager: Class<*>?
        ) = getAction {
            this.episodeUrl == episodeUrl &&
                    this.playerManager == playerManager
        }
            ?: PlayAction(episodeUrl, coverUrl, detailPartUrl, videoName)
    }

    override fun go(context: Context) {
        GO(context)
    }
}