package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.IComponentFactory
import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.action.Action
import com.su.mediabox.pluginapi.v2.action.CustomPageAction
import com.su.mediabox.pluginapi.v2.been.BaseData

/**
 * 自定义页面数据组件
 *
 * 由[CustomPageAction]启动，注意也必须在[IComponentFactory]的实现中注册
 */
interface ICustomPageComponent : IBaseComponent {

    /**
     * 页面名称
     */
    val pageName: String

    /**
     * 是否左上角显示返回按钮
     */
    fun isShowBack(): Boolean = true

    /**
     * 菜单，由[Action]组成，菜单标题使用[Action.extraData]
     */
    fun menus(): List<Action>? = null

    /**
     * 获取数据
     * @param page 由宿主控制的页码，在刷新时重置，在上拉时递增从1开始
     */
    suspend fun getData(page: Int): List<BaseData>?
}