package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.ExpensiveBase
import dagger.Module
import dagger.Provides

@Module
class ExpensiveBaseModule(val energy: Int){

    @Provides
    fun provideEnergy(): Int{
        return energy
    }

    @Provides
    fun providesExpensiveBase(expensiveBase: ExpensiveBase): Base{
        return expensiveBase
    }
}