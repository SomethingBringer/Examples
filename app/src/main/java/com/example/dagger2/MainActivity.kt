package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.Potion.Potion
import com.example.dagger2.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //TODO 1: Lets get the same volunteer within our app and the same potion within activity. Create new component
    @Inject
    lateinit var potion1: Potion
    @Inject
    lateinit var potion2: Potion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //TODO 5: update
        val potionComponent = DaggerActivityComponent.builder()
            .energy(100)
            .stability(50)
            .appComponent(((getApplication()) as App).getAppComponent())
            .build()
        potionComponent.inject(this)
        //potion = potionComponent.getPotion()
        potion1.effect()
        potion2.effect()

    }
}
