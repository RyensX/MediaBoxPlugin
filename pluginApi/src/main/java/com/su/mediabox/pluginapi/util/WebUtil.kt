package com.su.mediabox.pluginapi.util

lateinit var WebUtiIns: WebUtil

interface WebUtil {
    /**
     * 获取已渲染网页源码
     *
     * @param actionJs 在页面加载完成后执行的js代码，可用于主动加载资源，如让视频加载出来以拦截
     */
    suspend fun getRenderedHtmlCode(
        url: String,
        encoding: String = "utf-8",
        userAgentString: String? = null,
        actionJs: String? = null
    ): String

    /**
     * 拦截资源
     *
     * 由于无法确定最后加载，所以最好加一个超时（需要自己加，如使用协程的withTimeout），否则拦截不到会一直暂停
     *
     * @param actionJs 在页面加载完成后执行的js代码，可用于主动加载资源，如让视频加载出来以拦截
     */
    suspend fun interceptResource(
        url: String,
        regex: String,
        userAgentString: String? = null,
        actionJs: String? = null
    ): String
}