package com.example.dagger2.dagger

import com.example.dagger2.Potion.Base
import com.example.dagger2.Potion.CheapBase
import dagger.Binds
import dagger.Module

@Module
abstract class CheapBaseModule {

    @Binds
    abstract fun bindCheapBase(cheapBase: CheapBase): Base
}