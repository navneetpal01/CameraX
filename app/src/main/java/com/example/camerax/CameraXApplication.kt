package com.example.camerax

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CameraXApplication : Application(){

    override fun onCreate() {
        super.onCreate()
    }

}