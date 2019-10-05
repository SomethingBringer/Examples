package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger.ActivityComponent
import com.example.dagger2.dagger.AppComponent
import com.example.dagger2.dagger.DaggerAppComponent

class App: Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
    fun getAppComponent(): AppComponent {
        return component
    }
}