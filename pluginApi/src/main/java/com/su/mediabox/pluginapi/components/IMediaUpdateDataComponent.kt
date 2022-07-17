package com.su.mediabox.pluginapi.components

/**
 * 媒体更新数据组件
 */
interface IMediaUpdateDataComponent : IBasePageDataComponent {

    /**
     * 是否开启检查更新
     * @param updateTag 更新标志，如“全13集”这样的即表示无需更新
     *
     * @return 是否需要检查更新
     */
    suspend fun enableUpdateCheck(updateTag: String?): Boolean =
        updateTag?.run { !(contains("全") || contains("完结")) } ?: true

    /**
     * 获取更新标志，在打开收藏页时触发
     *
     * @param detailUrl 目标媒体详情页链接
     *
     * @return 更新标志，为空则表示失败
     */
    suspend fun getUpdateTag(detailUrl: String): String?
}