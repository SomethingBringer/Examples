package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
object ExtraModule {
        @JvmStatic
        @Provides
        fun provideCore(): Core {
            return Core()
        }
        @JvmStatic
        @Provides
        fun provideLiquid(): Liquid {
            val liquid = Liquid()
            liquid.clear()
            return liquid
        }
        @JvmStatic
        @Provides
        fun provideExtra(core: Core, liquid: Liquid): Extra {
            return Extra(core, liquid)
        }

}