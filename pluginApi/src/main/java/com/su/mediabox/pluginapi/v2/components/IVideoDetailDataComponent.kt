package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.been.BaseData

/**
 * 获取视频详情数据组件
 */
interface IVideoDetailDataComponent : IBaseComponent {
    /**
     * 获取番剧详情页数据
     *
     * @param partUrl  页面部分url
     * @return Triple<番剧封面,番剧名,详情页其他数据集>
     */
    suspend fun getAnimeDetailData(partUrl: String): Triple<String, String, List<BaseData>>

}