# 插件系统
-keep class com.su.mediabox.pluginapi.** {*;}
-keep class * extends com.su.mediabox.pluginapi.data.BaseData {*;}
-keep class * extends com.su.mediabox.pluginapi.components.IBasePageDataComponent {*;}
-keep class * extends com.su.mediabox.pluginapi.action.Action {*;}
-keep class * extends com.su.mediabox.pluginapi.IPluginFactory {*;}