package com.su.mediabox.plugin

import com.su.mediabox.pluginapi.IComponentFactory
import com.su.mediabox.pluginapi.components.IAnimeDetailComponent
import com.su.mediabox.pluginapi.components.IBaseComponent


/**
 * 每个插件必须实现本类
 *
 * 注意包和类名都要相同，且必须提供公开的无参数构造方法
 */
class ComponentFactory : IComponentFactory() {

    override fun <T : IBaseComponent> createComponent(clazz: Class<T>) = when (clazz) {
        IAnimeDetailComponent::class.java -> null
        else -> null
    } as? T

}