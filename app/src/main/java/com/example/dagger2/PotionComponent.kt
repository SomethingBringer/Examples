package com.example.dagger2

import dagger.Component
//This component interface holds a function that will provide us with Potion class.
//TODO 6: Annotate interface with @Component and create a function that will return needed class - Potion in our case.
@Component
interface PotionComponent {
    fun getPotion(): Potion
}