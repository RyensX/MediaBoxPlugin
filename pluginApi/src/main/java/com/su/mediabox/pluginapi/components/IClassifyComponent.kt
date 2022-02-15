package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.been.AnimeCoverBean
import com.su.mediabox.pluginapi.been.ClassifyBean
import com.su.mediabox.pluginapi.been.PageNumberBean

/**
 * 获取分类界面数据组件
 */
interface IClassifyComponent : IBaseComponent {
    /**
     * 获取分类界面头部分类信息
     *
     * @return 分类界面头部分类数据List
     */
    suspend fun getClassifyTabData(): List<ClassifyBean>

    /**
     * 获取每个分类下的内容
     *
     * @param partUrl  页面部分url
     * @return Pair
     * ArrayList<AnimeCoverBean>：数据List
     * PageNumberBean：下一页数据地址Bean，null则表示没有下一页
     */
    suspend fun getClassifyData(partUrl: String): Pair<List<AnimeCoverBean>, PageNumberBean?>

}