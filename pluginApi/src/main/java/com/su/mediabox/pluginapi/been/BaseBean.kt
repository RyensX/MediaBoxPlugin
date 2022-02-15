package com.su.mediabox.pluginapi.been

import java.io.Serializable

interface BaseBean : Serializable {
    var type: String
    var actionUrl: String
}