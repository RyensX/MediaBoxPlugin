package com.su.mediabox.pluginapi.action

import android.content.Context

class PlayAction private constructor(
    val episodeUrl: String,
    var coverUrl: String,
    var detailPartUrl: String,
    var videoName: String
) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: PlayAction.(Context) -> Unit

        /**
         * @param episodeUrl 剧集链接，插件只需要提供此参数，其余数据由宿主自动填入
         */
        fun obtain(
            episodeUrl: String,
            coverUrl: String = "",
            detailPartUrl: String = "",
            videoName: String = ""
        ) = getAction {
            this.episodeUrl == episodeUrl
        }
            ?: PlayAction(episodeUrl, coverUrl, detailPartUrl, videoName)
    }

    override fun go(context: Context) {
        GO(context)
    }
}