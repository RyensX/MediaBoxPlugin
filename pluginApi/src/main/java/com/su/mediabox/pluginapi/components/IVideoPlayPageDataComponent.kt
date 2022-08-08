package com.su.mediabox.pluginapi.components

import android.graphics.Color
import com.kuaishou.akdanmaku.data.DanmakuItemData
import com.su.mediabox.pluginapi.data.VideoPlayMedia
import com.su.mediabox.pluginapi.util.danmaku.AnimeDanmakuParser
import com.su.mediabox.pluginapi.util.danmaku.BiliBiliDanmakuParser

/**
 * 视频播放页面数据组件
 */
interface IVideoPlayPageDataComponent : IBasePageDataComponent {

    /**
     * 获取弹幕数据，需要自行实现
     *
     * 如果是B站等地方的弹幕可以参考使用[BiliBiliDanmakuParser]和[AnimeDanmakuParser]等辅助解析
     *
     * @return 弹幕数据集
     */
    suspend fun getDanmakuData(videoName: String, episodeName: String, episodeUrl: String):
            List<DanmakuItemData>? = null

    /**
     * 发送一条弹幕，如果需要登陆等验证需要自行实现逻辑
     *
     * @param danmaku 弹幕内容
     * @param time 弹幕显示时间(播放视频当前进度)
     * @param color 弹幕颜色，参考[Color]
     * @param type 弹幕类型，取值[DanmakuItemData]的DANMAKU_MODE，如[DanmakuItemData.DANMAKU_MODE_ROLLING]
     *
     * @return 发送结果
     */
    suspend fun putDanmaku(
        videoName: String,
        episodeName: String,
        episodeUrl: String,
        danmaku: String,
        time: Long,
        color: Int,
        type: Int
    ): Boolean = false

    /**
     * 获取播放页面相关数据
     */
    suspend fun getVideoPlayMedia(episodeUrl: String): VideoPlayMedia

}