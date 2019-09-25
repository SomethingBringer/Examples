package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var potion: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO 7: create our component via invoking Dagger[Our Interface].create
        val potionComponent = DaggerPotionComponent.create()
        //TODO 8: Call function from component to get an instance of needed class. Call class fun, run the up and see some logs.
        potion = potionComponent.getPotion()
        potion.effect()
    }
//    This example is inspired by Coding in Flow Dagger tutorial on Youtube
//    in this example we are going to create some potions using dagger so the next step is
    //TODO 3: Create Potion, base and extra classes
}
