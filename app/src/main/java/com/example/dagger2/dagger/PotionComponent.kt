package com.example.dagger2

import dagger.Component

@Component(modules = [ExtraModule::class, CheapBaseModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)
}
