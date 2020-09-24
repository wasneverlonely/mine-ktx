package com.was.minektx

import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

class SysInfo : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }

}