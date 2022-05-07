package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.util.UIUtil.dp

/**
 * 横幅视图组件数据
 * @param autoPlayInterval 自动轮播时间间隔，如果为0则不会自动轮播
 * @param round 圆角
 */
data class BannerData(
    val bannerItems: List<BannerItemData>,
    val round: Int = 4.dp,
    val autoPlayInterval: Long = 5000
) :
    BaseData() {

    class BannerItemData(
        val imageUrl: String,
        val title: String,
        val desc: String,
    ) : BaseData() {
        override var paddingLeft: Int = 0.dp
        override var paddingTop: Int = 0.dp
        override var paddingRight: Int = 0.dp
        override var paddingBottom: Int = 0.dp
    }
}