package com.su.mediabox.pluginapi.action

import android.content.Context
import com.su.mediabox.pluginapi.util.WebUtil

class WebBrowserAction private constructor(val url: String, val loadPolicy: WebUtil.LoadPolicy) :
    Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: WebBrowserAction.(Context) -> Unit

        @JvmOverloads
        fun obtain(url: String, loadPolicy: WebUtil.LoadPolicy = WebUtil.DefaultLoadPolicy) =
            getAction { this.url == url } ?: WebBrowserAction(url, loadPolicy)
    }

    override fun go(context: Context) {
        GO(context)
    }
}