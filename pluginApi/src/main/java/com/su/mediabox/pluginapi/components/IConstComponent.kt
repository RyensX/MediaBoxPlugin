package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.IComponentFactory

/**
 * 插件包的配置信息组件
 */
@IComponentFactory.SingletonComponent
interface IConstComponent : IBaseComponent {

    /**
     * 数据源地址
     */
    val host: String

    val refererProcessor: RefererProcessor?

    /**
     * 用于处理类似referer防盗链等情况
     */
    interface RefererProcessor {
        /**
         * @param url 请求链接
         * @return referer
         */
        fun processor(url: String): String?
    }
}