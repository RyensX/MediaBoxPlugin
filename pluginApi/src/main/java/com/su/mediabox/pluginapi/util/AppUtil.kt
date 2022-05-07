package com.su.mediabox.pluginapi.util

import android.content.Context

object AppUtil {

    var appContext: Context? = null
        private set

    /**
     * 由App初始化
     */
    fun init(applicationContext: Context) {
        appContext = applicationContext
    }

}