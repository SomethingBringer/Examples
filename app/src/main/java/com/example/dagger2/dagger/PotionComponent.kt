package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.Component
//TODO 5: We use component to get our potion. But we have 2 modules for Base. So how dagger will understand which one to use?
//Simply write the needed module in (modules).
@Component(modules = [ExtraModule::class, CheapBaseModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)
}
