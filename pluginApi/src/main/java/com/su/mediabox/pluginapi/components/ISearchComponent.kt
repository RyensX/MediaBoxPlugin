package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeCoverBean
import com.su.mediabox.pluginapi.been.PageNumberBean

/**
 * 获取搜索界面数据组件
 */
interface ISearchComponent : IBaseComponent {
    /**
     * 获取搜索结果数据
     *
     * @param keyWord  搜索关键词
     * @param partUrl  搜索页面部分url
     * @return Pair
     * List<AnimeCoverBean>：搜索结果
     * PageNumberBean：下一页数据地址Bean，null则表示没有下一页
     */
    suspend fun getSearchData(
        keyWord: String,
        partUrl: String
    ): Pair<List<AnimeCoverBean>, PageNumberBean?>

}