package com.su.mediabox.pluginapi.v2.action

class WebBrowserAction private constructor(val url: String) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: WebBrowserAction.() -> Unit

        fun obtain(url: String) = getAction { this.url == url } ?: WebBrowserAction(url)
    }

    override fun go() {
        GO()
    }
}