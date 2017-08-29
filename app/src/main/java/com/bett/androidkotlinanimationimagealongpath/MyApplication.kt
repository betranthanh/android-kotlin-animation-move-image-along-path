package com.bett.androidkotlinanimationimagealongpath

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco



/**
 * Created by bett on 8/25/17.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}