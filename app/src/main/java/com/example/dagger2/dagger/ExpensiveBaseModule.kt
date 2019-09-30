package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.ExpensiveBase
import dagger.Binds
import dagger.Module

//TODO 3: Create modules for our classes
@Module
abstract class ExpensiveBaseModule {
    //TODO 4: Create a @Binds function that will provide us with an object of needed interface. Expensive Base in this case.
    //Now if we call for Base object, dagger will provide it for us with this fun
    @Binds
    abstract fun bindExpensiveBase(expensiveBase: ExpensiveBase): Base
}