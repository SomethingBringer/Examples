package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var potion: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val potionComponent = DaggerPotionComponent.create()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion.effect()
    }

}
