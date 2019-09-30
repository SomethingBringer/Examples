package com.example.dagger2

import dagger.Component

@Component
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)
}