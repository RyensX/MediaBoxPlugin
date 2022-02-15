package com.su.mediabox.pluginapi.been

class AnimeInfoBean(
    override var type: String,
    override var actionUrl: String,
    var title: String,
    var cover: String,
    var alias: String,
    var area: String,
    var year: String,
    var index: String,
    var animeType: List<AnimeTypeBean>,
    var tag: List<AnimeTypeBean>,
    var info: String
) : BaseBean

class AnimeDetailBean(
    override var type: String,
    override var actionUrl: String,
    override var title: String,
    override var describe: String?,
    override var episodeList: List<AnimeEpisodeDataBean>? = null,
    override var animeCoverList: List<AnimeCoverBean>? = null,
    override var headerInfo: AnimeInfoBean? = null
) : IAnimeDetailBean

interface IAnimeDetailBean : BaseBean {
    var title: String
    var describe: String?
    var episodeList: List<AnimeEpisodeDataBean>?
    var animeCoverList: List<AnimeCoverBean>?
    var headerInfo: AnimeInfoBean?
}

class AnimeEpisodeDataBean(
    override var type: String,
    override var actionUrl: String,
    var title: String,
    var videoUrl: String = ""
) : BaseBean