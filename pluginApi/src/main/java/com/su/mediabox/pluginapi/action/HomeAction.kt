package com.su.mediabox.pluginapi.action

import android.content.Context

object HomeAction : Action() {

    //由宿主初始化
    lateinit var GO: HomeAction.(Context) -> Unit

    override fun go(context: Context) {
        GO(context)
    }
}