package com.su.mediabox.pluginapi.v2.been

/**
 * 多页面视图组件数据，类似ViewPager(2)
 * @param pages 推荐使用同一个实例，然后通过page控制加载内容
 */
//TODO 更多自定义属性
class ViewPagerData(
    val pageLoaders: List<PageLoader>
) : BaseData() {
    interface PageLoader {

        val pageName: String

        /**
         * 加载数据
         * @param page 页码，从0开始
         */
        suspend fun loadData(page: Int): List<BaseData>
    }
}