package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import com.example.dagger2.dagger.DaggerPotionComponent
import com.example.dagger2.dagger.ExpensiveBaseModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var potion: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO 8: Change our builder
        val potionComponent = DaggerPotionComponent.builder()
            //.expansiveBaseModule(ExpansiveBaseModule(100))
            .energy(100)
            .stability(50)
            .build()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion.effect()
    }
}
