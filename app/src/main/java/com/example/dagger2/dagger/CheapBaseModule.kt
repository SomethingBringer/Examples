package com.example.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class CheapBaseModule {
    @Binds
    abstract fun bindCheapBase(cheapBase: CheapBase): Base
}