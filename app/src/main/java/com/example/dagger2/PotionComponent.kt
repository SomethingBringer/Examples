package com.example.dagger2

import dagger.Component

@Component
interface PotionComponent {
    fun getPotion(): Potion
    //TODO 2: Create inject function and pass it the main activity
    //If u want to inject other activity or fragment - u should pass it
    fun inject(mainActivity: MainActivity)
}