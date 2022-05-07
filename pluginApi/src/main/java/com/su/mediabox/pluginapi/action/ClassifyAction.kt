package com.su.mediabox.pluginapi.action

import android.content.Context

class ClassifyAction private constructor(
    val url: String?,
    val classifyCategory: String?,
    val classify: String?
) : Action() {
    companion object {
        //由宿主初始化
        lateinit var GO: ClassifyAction.(Context) -> Unit

        /**
         * @param url 分类链接，不为空时默认加载
         * @param classifyCategory 分类类别，如地区
         * @param classify 具体分类，如大陆，与classifyCategory均不为空则自动定位选中
         */
        fun obtain(
            url: String? = null,
            classifyCategory: String? = null,
            classify: String? = null
        ) =
            getAction { this.url == url && this.classifyCategory == classifyCategory && this.classify == classify }
                ?: ClassifyAction(url, classifyCategory, classify)
    }

    override fun go(context: Context) {
        GO(context)
    }
}