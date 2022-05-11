package com.su.mediabox.pluginapi.util

/**
 * Web工具，由宿主初始化
 */
lateinit var WebUtiIns: WebUtil

interface WebUtil {
    /**
     * 获取已渲染网页源码
     *
     * @param callBackRegex 回调正则。在检测到特定请求时返回结果，如果一直没有匹配到则会一直没有返回，建议自行提供一个超时返回。默认为空则在页面加载完成后自动回调（因为ajax等因素可能得到的源码不完整）
     * @param actionJs 在页面加载完成后执行的js代码，可用于主动加载资源，如让视频加载出来以拦截
     */
    suspend fun getRenderedHtmlCode(
        url: String,
        callBackRegex: String = "",
        encoding: String = "utf-8",
        userAgentString: String? = null,
        actionJs: String? = null
    ): String

    /**
     * 拦截资源
     *
     * 由于无法确定最后加载，所以最好加一个超时（需要自己加，如使用协程的withTimeout），否则拦截不到会一直暂停
     *
     * @param regex 回调正则，在检测到特定请求时返回结果
     * @param actionJs 在页面加载完成后执行的js代码，可用于主动加载资源，如让视频加载出来以拦截
     */
    suspend fun interceptResource(
        url: String,
        regex: String,
        userAgentString: String? = null,
        actionJs: String? = null
    ): String
}