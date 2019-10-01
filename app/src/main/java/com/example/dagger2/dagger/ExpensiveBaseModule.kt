package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.ExpensiveBase
import dagger.Module
import dagger.Provides

@Module
class ExpensiveBaseModule(val energy: Int){

    //TODO 1: We can upgrade our module. We can tell dagger how to provide energy via @Provides function
    @Provides
    fun provideEnergy(): Int{
        return energy
    }

    //TODO 3: Since dagger knows how to create an expansive base - we can upgrade our function here
    @Provides
    fun providesExpensiveBase(expensiveBase: ExpensiveBase): Base{
        return expensiveBase
    }
}