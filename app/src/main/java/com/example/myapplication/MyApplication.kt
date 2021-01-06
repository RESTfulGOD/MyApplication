package com.example.myapplication

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication: Application() {
    companion object {
        const val TAG = "MyApplication"
    }
    override fun onCreate() {
        super.onCreate()
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this@MyApplication)
        Log.d(TAG, "ARouter init finish")
    }
}