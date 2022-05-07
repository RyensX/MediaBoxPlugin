package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.data.BaseData
import com.su.mediabox.pluginapi.data.MediaInfo2Data

/**
 * 媒体搜索页面数据组件
 */
interface IMediaSearchPageDataComponent : IBasePageDataComponent {
    /**
     * 获取搜索结果数据
     *
     * @param keyWord  搜索关键词
     * @param page 页码，由宿主控制（成功请求+1）
     *
     * @return 推荐使用[MediaInfo2Data]
     */
    suspend fun getSearchData(
        keyWord: String,
        page: Int
    ): List<BaseData>

}