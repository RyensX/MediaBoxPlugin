package com.su.mediabox.pluginapi.util

import android.content.Context

object AppUtil {

    lateinit var appContext: Context
        private set

    /**
     * 由App初始化
     */
    fun init(applicationContext: Context) {
        appContext = applicationContext
    }

}