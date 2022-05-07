package com.su.mediabox.pluginapi.action

import android.content.Context
import com.su.mediabox.pluginapi.util.AppUtil
import java.io.Serializable

/**
 * 组件数据动作
 *
 * 每个Action都必须实现一个静态的obtain公开方法生成对应动作而不是直接构造
 */
abstract class Action : Serializable {

    /**
     * 额外数据，用于扩展Action
     */
    var extraData: Any? = null

    companion object {
        //动作池，每种动作对应一个List
        val actionPool by lazy(LazyThreadSafetyMode.NONE) { mutableMapOf<Class<out Action>, MutableSet<Action>>() }

        fun putAction(action: Action) {
            val set = actionPool[action.javaClass]
                ?: mutableSetOf<Action>().also { actionPool[action.javaClass] = it }
            set.add(action)
        }

        inline fun <reified A : Action> getAction(equal: A.() -> Boolean) =
            actionPool[A::class.java]?.find {
                it is A && it.equal()
            } as? A
    }

    /**
     * 动作执行
     *
     * @param context 不要持有，有需要全局可使用[AppUtil.appContext]
     */
    abstract fun go(context: Context)
}