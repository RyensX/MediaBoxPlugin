package com.su.mediabox.pluginapi.v2.action

class DetailAction private constructor(val url: String) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: DetailAction.() -> Unit

        fun obtain(url: String) = getAction { this.url == url } ?: DetailAction(url)
    }

    override fun go() {
        GO()
    }
}