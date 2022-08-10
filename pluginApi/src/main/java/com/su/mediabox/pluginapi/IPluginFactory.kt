package com.su.mediabox.pluginapi

import com.su.mediabox.pluginapi.action.Action
import com.su.mediabox.pluginapi.components.IBasePageDataComponent
import com.su.mediabox.pluginapi.action.HomeAction
import java.lang.annotation.Inherited

/**
 * 插件工厂
 *
 * 每个插件都必须实现且提供一个无参构造方法
 */
abstract class IPluginFactory {

    /**
     * 入口动作，在插件列表启动插件后执行的动作，一般用于启动初始界面
     *
     * 默认[HomeAction]，即直接启动家页面
     */
    open val initAction: Action = HomeAction

    /**
     * 根据类型创建组件
     */
    abstract fun <T : IBasePageDataComponent> createComponent(clazz: Class<T>): T?

    /**
     * 插件启动时被调用
     */
    open fun pluginLaunch() {}

    /**
     * 插件对应数据源域名
     */
    abstract val host: String

    open val imageRefererProcessor: ImageRefererProcessor? = null

    /**
     * 用于处理类似referer防盗链等情况
     */
    fun interface ImageRefererProcessor {
        /**
         * @param url 请求链接
         * @return referer
         */
        fun processor(url: String): String?
    }

    /**
     * 单例组件注解。
     *
     * 被标注次注解的组件在宿主里create时会加入组件池作为单例
     */
    @Target(AnnotationTarget.CLASS)
    @Retention(AnnotationRetention.RUNTIME)
    @Inherited
    annotation class SingletonComponent

}