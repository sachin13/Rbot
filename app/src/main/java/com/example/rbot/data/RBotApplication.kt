package com.example.rbot.data

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RBotApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}