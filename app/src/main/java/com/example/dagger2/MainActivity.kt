package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import com.example.dagger2.dagger.ExpensiveBaseModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var potion1: Potion
    @Inject
    lateinit var potion2: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val potionComponent = (getApplication() as App).getAppComponent()
            .getActivityComponent(ExpensiveBaseModule(190))
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion1.effect()
        potion2.effect()

    }
}
