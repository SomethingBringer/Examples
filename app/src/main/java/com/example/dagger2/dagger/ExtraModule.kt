package com.example.dagger2.dagger

import com.example.dagger2.Potion.Core
import com.example.dagger2.Potion.Extra
import com.example.dagger2.Potion.Liquid
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