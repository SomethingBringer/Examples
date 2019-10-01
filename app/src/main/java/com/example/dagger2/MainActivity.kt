package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import com.example.dagger2.dagger.DaggerPotionComponent
import com.example.dagger2.dagger.ExpensiveBaseModule
import javax.inject.Inject
//TODO 1: Create new Volunteer class. Every time we ask our component to get a car - we will get a new one and @Inject constructor.
//But what if we want to use the same object?
class MainActivity : AppCompatActivity() {
    //TODO 3: Create another Potion and call it effect()
    //Run the project. In logs u will see different volunteers testing different potions
    //Lets make just one volunteer to test all of the potions.
    @Inject
    lateinit var potion1: Potion
    @Inject
    lateinit var potion2: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val potionComponent = DaggerPotionComponent.builder()
            //.expansiveBaseModule(ExpansiveBaseModule(100))
            .energy(100)
            .stability(50)
            .build()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion1.effect()
        potion2.effect()
    }
}
