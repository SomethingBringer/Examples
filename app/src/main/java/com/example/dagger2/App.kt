package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger.DaggerPotionComponent
import com.example.dagger2.dagger.PotionComponent
//TODO 2: Put the instance of the component in our class and write a getter for it
//TODO 3: Write android:name=".our class" in the application in the manifest
class App: Application() {
    private lateinit var component: PotionComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerPotionComponent.builder()
            .energy(100)
            .stability(50)
            .build()
    }
    fun getAppComponent(): PotionComponent {
        return component
    }
}