package com.su.mediabox.pluginapi

import android.content.Context

object AppUtil {

    var appContext: Context? = null
        private set

    var appProcessor: IRouteProcessor? = null
        private set

    /**
     * 由App初始化
     */
    fun init(applicationContext: Context, appProcessor: IRouteProcessor) {
        appContext = applicationContext
        this.appProcessor = appProcessor
    }

    interface IRouteProcessor {
        /**
         * 处理根据actionUrl跳转
         *
         * @param actionUrl 跳转路径
         * @return 成功处理了跳转，则返回true，没处理则返回false
         */
        fun process(actionUrl: String): Boolean
    }

}