package com.su.mediabox.pluginapi.util

/**
 * 插件键对存储工具，由宿主初始化，插件直接调用即可，不需要自己实现
 *
 * 注意：该工具不能在单元测试中使用
 */
lateinit var PluginPreferenceIns: PluginPreference

interface PluginPreference {
    /**
     * 获取键值
     *
     * @param defaultValue 默认值
     * @param isVisual 可视化，如果为真则会显示在插件菜单上并可编辑。注意：是否可视化的键对是两个不同的键对
     */
    suspend fun <T> get(key: String, defaultValue: T, isVisual: Boolean = true): T

    /**
     * 设置键值
     *
     * @param value 只能基本类型
     * @param isVisual 可视化，如果为真则会显示在插件菜单上并可编辑。注意：是否可视化的键对是两个不同的键对
     *
     * @return 是否成功持久化
     */
    suspend fun <T> set(key: String, value: T, isVisual: Boolean = true): Boolean

    /**
     * 初始化键对，如果键对已存在则无效
     *
     * @param defaultValue 默认值
     */
    fun <T> initKey(key: String, defaultValue: T, isVisual: Boolean = true)
}