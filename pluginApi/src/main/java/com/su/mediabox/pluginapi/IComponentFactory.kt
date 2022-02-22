package com.su.mediabox.pluginapi

import com.su.mediabox.pluginapi.components.IBaseComponent
import java.lang.annotation.Inherited

/**
 * 组件工厂
 *
 * 每个插件都必须实现[Constant.PLUGIN_INIT_CLASS]且提供一个无参构造方法
 */
abstract class IComponentFactory {

    /**
     * 根据类型创建组件
     */
    abstract fun <T : IBaseComponent> createComponent(clazz: Class<T>): T?

    /**
     * 单例组件注解。
     *
     * 被标注次注解的组件在宿主里create时会加入组件池作为单例
     */
    @Target(AnnotationTarget.CLASS)
    @Retention(AnnotationRetention.RUNTIME)
    @Inherited
    annotation class SingletonComponent

    /**
     * 插件API版本
     *
     * 在载入时会检查宿主支持的最低插件API版本，必须大于等于才能使用
     */
    val apiVersion = 1
}