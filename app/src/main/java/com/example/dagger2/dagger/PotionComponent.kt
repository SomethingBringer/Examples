package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.Component

@Component(modules = [ExtraModule::class, ExpensiveBaseModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)
}
