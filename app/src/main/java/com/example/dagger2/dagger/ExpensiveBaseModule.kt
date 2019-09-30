package com.example.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class ExpensiveBaseModule {
    @Binds
    abstract fun bindExpensiveBase(expensiveBase: ExpensiveBase):Base
}