package com.su.mediabox.pluginapi.data

import com.su.mediabox.pluginapi.action.ClassifyAction

/**
 * 分类项数据，如大陆
 *
 * 必须提供一个[ClassifyAction]
 *
 * 宿主在获取所有分类项数据后会根据[ClassifyAction.classifyCategory]自动进行分类
 */
class ClassifyItemData : BaseData()