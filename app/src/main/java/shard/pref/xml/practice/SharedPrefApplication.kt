package shard.pref.xml.practice

import android.app.Application

class SharedPrefApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPrefUtil(this)
    }


}