package com.su.mediabox.pluginapi.v2.action

import com.su.mediabox.pluginapi.v2.been.BaseData
import java.io.Serializable

class CustomDataAction private constructor(
    val title: String,
    val loader: Loader,
    val actions: List<Action>?
) :
    Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: CustomDataAction.() -> Unit

        fun obtain(title: String, loader: Loader, actions: List<Action>? = null) =
            getAction { this.title == title && this.loader == loader }
                ?: CustomDataAction(title, loader, actions)
    }

    override fun go() {
        GO()
    }

    interface Loader : Serializable {
        /**
         * 加载数据
         * @param page 页码(Tab的index)，从0开始
         */
        suspend fun loadData(page: Int): List<BaseData>?
    }
}