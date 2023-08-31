package com.example.splitthebill.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module


class AppModule {

    companion object {
        fun init(appContext: Context) {
            startKoin {
                androidContext(appContext)
                modules(appModule)
            }
        }


        private val appModule = module {


        }
    }
}