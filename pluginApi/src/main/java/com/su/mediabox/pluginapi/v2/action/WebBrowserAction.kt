package com.su.mediabox.pluginapi.v2.action

import android.content.Context

class WebBrowserAction private constructor(val url: String) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: WebBrowserAction.(Context) -> Unit

        fun obtain(url: String) = getAction { this.url == url } ?: WebBrowserAction(url)
    }

    override fun go(context: Context) {
        GO(context)
    }
}