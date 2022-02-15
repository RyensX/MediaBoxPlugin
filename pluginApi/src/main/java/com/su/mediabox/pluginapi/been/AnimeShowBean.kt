package com.su.mediabox.pluginapi.been

class AnimeShowBean(
    override var type: String,
    override var actionUrl: String,
    override var url: String,
    override var title: String,
    override var rTitle: String,
    override var cover: String?,
    override var episode: String,
    override var animeCoverList: List<AnimeCoverBean>? = null
) : BaseBean, IAnimeShowBean

interface IAnimeShowBean : BaseBean {
    var url: String
    var title: String
    var rTitle: String
    var cover: String?
    var episode: String
    var animeCoverList: List<AnimeCoverBean>?
}

class AnimeCoverBean(
    override var type: String,
    override var actionUrl: String,
    override var url: String,
    override var title: String,
    override var cover: String?,
    override var episode: String,
    var animeType: List<AnimeTypeBean>? = null,
    override var describe: String? = null,
    var episodeClickable: AnimeEpisodeDataBean? = null,
    var area: AnimeAreaBean? = null,
    var date: String? = null,
    //视频大小
    var size: String? = null,
    //集数
    var episodeCount: String? = null,
    // 0：/storage/emulated/0/Android/data/packname/files
    // 1：/storage/emulated/0/
    var path: Int = 0,
    override var rTitle: String = "",
    override var animeCoverList: List<AnimeCoverBean>? = null,
    override var episodeList: List<AnimeEpisodeDataBean>? = null,
    override var headerInfo: AnimeInfoBean? = null
) : BaseBean, IAnimeShowBean, IAnimeDetailBean

class AnimeTypeBean(
    override var type: String,
    override var actionUrl: String,
    var url: String,
    var title: String
) : BaseBean

class AnimeAreaBean(
    override var type: String,
    override var actionUrl: String,
    var url: String,
    var title: String
) : BaseBean