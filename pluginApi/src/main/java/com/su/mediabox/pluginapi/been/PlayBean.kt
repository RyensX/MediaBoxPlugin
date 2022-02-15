package com.su.mediabox.pluginapi.been

class PlayBean(
    override var type: String,
    override var actionUrl: String,
    var title: AnimeTitleBean,
    var episode: AnimeEpisodeDataBean,
    var data: List<IAnimeDetailBean>
) : BaseBean

class AnimeTitleBean(
    override var type: String,
    override var actionUrl: String,
    var title: String
) : BaseBean