package com.atguigu.bigdata.spark.streaming.req.application

import com.atguigu.bigdata.spark.streaming.req.controller.MockDataController
import com.atguigu.summer.framework.core.TApplication

object MockDataApplication extends App with TApplication{

    start("sparkStreaming") {
        val controller = new MockDataController
        controller.execute()
    }
}
