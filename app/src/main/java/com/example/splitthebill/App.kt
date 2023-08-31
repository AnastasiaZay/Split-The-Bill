package com.example.splitthebill

import android.app.Application
import com.example.splitthebill.di.AppModule

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Database.init(this)
        AppModule.init(this)
    }
}