package com.example.dagger2

import dagger.Component
//TODO 5: Add modules to our component
//Since that's the place were we create Potion (via getPotion or injecting Potion field into the activity)
@Component(modules = [ExtraModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)
}
//TODO 6: Run project and watch for logs.