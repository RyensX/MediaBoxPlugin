package com.su.mediabox.pluginapi.v2.action

class SearchAction private constructor(val keyWork: String) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: SearchAction.() -> Unit

        fun obtain(keyWork: String = "") =
            getAction { this.keyWork == keyWork } ?: SearchAction(keyWork)
    }

    override fun go() {
        GO()
    }
}