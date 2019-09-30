package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.ExpensiveBase
import dagger.Module
import dagger.Provides

@Module
class ExpensiveBaseModule(val energy: Int){
    //TODO 2: Change @Binds to @Provides. Pass needed value to the module constructor to be able to pass it in the function.
    @Provides
    fun providesExpensiveBase(): Base{
        return ExpensiveBase(energy)
    }
}