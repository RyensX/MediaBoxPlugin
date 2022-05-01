package com.su.mediabox.pluginapi.v2.action

import android.content.Context
import com.su.mediabox.pluginapi.v2.components.ICustomPageComponent

class CustomPageAction private constructor(val targetPageComponent: Class<*>) : Action() {

    companion object {
        //由宿主初始化
        lateinit var GO: CustomPageAction.(Context) -> Unit

        fun <T : ICustomPageComponent> obtain(targetPageComponent: Class<T>) =
            getAction { this.targetPageComponent == targetPageComponent }
                ?: CustomPageAction(targetPageComponent)
    }

    override fun go(context: Context) {
        GO(context)
    }
}