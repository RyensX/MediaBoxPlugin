# MediaBoxPlugin
 [**MediaBox**](https://github.com/RyensX/MediaBox)插件API

## 编写指南
1. 创建一个**Android App**项目
2. 在AndroidManifest.xml任意一个Activity（该Activity作为展示页，可添加关于信息等）上添加一个action(**media_box_plugin_action**)以标记为插件
3. 实现[com.su.mediabox.plugin.ComponentFactory](pluginApi/src/main/java/com/su/mediabox/pluginapi/IComponentFactory.kt) 具体见代码内注释
   宿主会索引拥有action(**media_box_plugin_action**)标签的ComponentFactory  
   ***注意，该类必须位于包com.su.mediabox.plugin内，并且必须实现IComponentFactory***
4. 根据需要实现[com.su.mediabox.pluginapi.components](pluginApi/src/main/java/com/su/mediabox/pluginapi/components/)下的组件，每种组件对应某个页面或者某一部分数据，具体使用见注释和示例
5. 目前无法通过Android studio进行调试，请使用单元测试
## 示例
- [插件示例](app/src/main/java/com/su/)
- [樱花动漫](https://github.com/RyensX/SakuraAnimePlugin)
