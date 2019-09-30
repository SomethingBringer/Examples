package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.CheapBase
import dagger.Binds
import dagger.Module

//TODO 3: Create modules for our classes
@Module
abstract class CheapBaseModule {
    //TODO 4: Create a @Binds function that will provide us with an object of needed interface. Cheap Base in this case.
    //Now if we call for Base object, dagger will provide it for us with this fun
    @Binds
    abstract fun bindCheapBase(cheapBase: CheapBase): Base
}