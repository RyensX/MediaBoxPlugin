package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.data.BaseData

/**
 * 媒体详情页面数据组件
 */
interface IMediaDetailPageDataComponent : IBasePageDataComponent {
    /**
     * 获取番剧详情页数据
     *
     * @param partUrl  页面部分url
     * @return Triple<番剧封面,番剧名,详情页其他数据集>
     */
    suspend fun getAnimeDetailData(partUrl: String): Triple<String, String, List<BaseData>>

}