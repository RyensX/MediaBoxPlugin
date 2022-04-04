package com.su.mediabox.pluginapi.v2.been

import com.su.mediabox.pluginapi.v2.action.ClassifyAction

/**
 * 分类项数据，如大陆
 *
 * 必须提供一个[ClassifyAction]
 *
 * 宿主在获取所有分类项数据后会根据[ClassifyAction.classifyCategory]自动进行分类
 */
class ClassifyItemData : GridItemData()