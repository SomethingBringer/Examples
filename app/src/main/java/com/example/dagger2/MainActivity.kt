package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //Field injection is made for framework types, that android system instantiates. Like activities and fragments.
    //So we don't create our main activity object, which means we cant do construction injection into our main activity.
    //That's why we inject fields
    //TODO 1: Add @inject annotation to the potion field. This field cant be final or private.
    @Inject
    lateinit var potion: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val potionComponent = DaggerPotionComponent.create()
        //TODO 3: inject our activity. We tell dagger to take THIS activity and provide it with fields that can be INJECTed (potion in our case)
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion.effect()
        //TODO 4: Run the project. The log should work as intended.
    }

}
