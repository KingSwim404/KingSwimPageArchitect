package com.kingswim.baselibrary

import android.app.Application
import com.blankj.utilcode.util.ThreadUtils
import kotlin.concurrent.thread

abstract class BaseApplication: Application() {

    private val mainTask = mutableListOf<InitTask>()

    private val backgroundTask = mutableListOf<InitTask>()

    protected fun startTask(){
        if(ThreadUtils.isMainThread()){
            doInMain()
            thread { doInBackground() }
        }
    }

    protected fun addMainTask(task:InitTask){
        mainTask.add(task)
    }

    protected fun addBackgroundTask(task:InitTask){
        backgroundTask.add(task)
    }

    private fun doInMain(){
         mainTask.forEach{
             it.run()
         }
        mainTask.clear()
    }

    private fun doInBackground(){
        backgroundTask.forEach {
            Thread(it).start()
        }
        backgroundTask.clear()
    }

}

interface InitTask:Runnable
