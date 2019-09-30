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
        //TODO 3: Change our component creation
        //Now dagger don't know how to create the module of our component - so we can't use create().
        //Now we should use build().someModule( and here we pass the needed value ) and then call build()
        val potionComponent = DaggerPotionComponent.builder()
            .expensiveBaseModule(ExpensiveBaseModule(100))
            .build()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion.effect()
    }
    //TODO 4: Run the project and watch for logs.
}
