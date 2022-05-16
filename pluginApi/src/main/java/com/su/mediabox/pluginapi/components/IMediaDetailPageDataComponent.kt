package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.data.BaseData

/**
 * 媒体详情页面数据组件
 */
interface IMediaDetailPageDataComponent : IBasePageDataComponent {
    /**
     * 获取媒体详情页数据
     *
     * @param partUrl  页面部分url
     * @return Triple<封面,名称,详情页其他数据集>
     */
    suspend fun getMediaDetailData(partUrl: String): Triple<String, String, List<BaseData>>

}