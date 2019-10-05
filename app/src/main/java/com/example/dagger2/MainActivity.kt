package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import com.example.dagger2.dagger.DaggerPotionComponent
import com.example.dagger2.dagger.ExpensiveBaseModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //@Singleton annotation is getting one instance of a class within a scope
    //So every time the new component is created - we will get a new object
    //If we want the same object during whole application lifecycle, we need to change a scope
    //TODO 1: Create new class and extend it from Application
    @Inject
    lateinit var potion1: Potion
    @Inject
    lateinit var potion2: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO 4: Get our component from the app. Run the project, rotate the phone and watch the logs
        //U will get the same volunteer, because the component is the same during life of our app
        val potionComponent = (getApplication() as App).getAppComponent()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion1.effect()
        potion2.effect()

    }
}
