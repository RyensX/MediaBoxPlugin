package com.su.mediabox.pluginapi.action

import android.content.Context

class SearchAction private constructor(val keyWork: String) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: SearchAction.(Context) -> Unit

        fun obtain(keyWork: String = "") =
            getAction { this.keyWork == keyWork } ?: SearchAction(keyWork)
    }

    override fun go(context: Context) {
        GO(context)
    }
}