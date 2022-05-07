package com.su.mediabox.pluginapi.data

/**
 * 多页面视图组件数据，类似ViewPager(2)
 * @param pages 推荐使用同一个实例，然后通过page控制加载内容
 * @param defaultPage 默认打开的页，默认0
 */
//TODO 更多自定义属性
data class ViewPagerData(
    val pageLoaders: List<PageLoader>,
    val defaultPage: Int = 0
) : BaseData() {
    interface PageLoader {

        fun pageName(page: Int): String

        /**
         * 加载数据
         * @param page 页码(Tab的index)，从0开始
         */
        suspend fun loadData(page: Int): List<BaseData>
    }
}