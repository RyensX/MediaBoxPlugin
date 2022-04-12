package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.UI.dp

/**
 * 横幅视图组件数据
 * @param autoPlayInterval 自动轮播时间间隔，如果为0则不会自动轮播
 */
class BannerData(val bannerItems: List<BannerItemData>, val autoPlayInterval: Long = 5000) :
    BaseData() {
    /**
     * @param imageRound 圆角
     */
    class BannerItemData(
        val imageUrl: String,
        val title: String,
        val desc: String,
        val imageRound: Int = 4.dp
    ) : BaseData() {
        override var paddingLeft: Int = 0.dp
        override var paddingTop: Int = 0.dp
        override var paddingRight: Int = 0.dp
        override var paddingBottom: Int = 0.dp
    }
}