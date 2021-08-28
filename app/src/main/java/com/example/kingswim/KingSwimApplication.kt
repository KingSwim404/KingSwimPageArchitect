package com.example.kingswim

import com.blankj.utilcode.util.LogUtils
import com.kingswim.baselibrary.BaseApplication
import com.kingswim.baselibrary.InitTask

class KingSwimApplication: BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        addMainTask(A0Task())
        addMainTask(A1Task())
        addBackgroundTask(B0Task())
        addBackgroundTask(B1Task())
        startTask()
    }
}

class A0Task:InitTask{
    override fun run() {
        LogUtils.eTag("A0Task",Thread.currentThread().name)
    }
}
class A1Task:InitTask{
    override fun run() {
        LogUtils.eTag("A1Task",Thread.currentThread().name)
    }
}

class B0Task:InitTask{
    override fun run() {
        Thread.sleep(5000)
        LogUtils.eTag("B0Task",Thread.currentThread().name)
    }
}
class B1Task:InitTask{
    override fun run() {
        LogUtils.eTag("B1Task",Thread.currentThread().name)
    }
}