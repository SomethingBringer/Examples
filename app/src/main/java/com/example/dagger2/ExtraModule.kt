package com.example.dagger2

import dagger.Module
import dagger.Provides

//TODO 3: Create an OBJECT - ExtraModule.
//The thing is - we do not need an instance of the ExtraModule. In java for that u can just call functions as Static.
//In Kotlin u might think, that u will just make a Companion object. Well... This wont work
//So we create an object and annotate our functions with @JvmStatic
@Module
object ExtraModule {
    //TODO 4: Write the methods that will create object instances from "third party library".
    //Since we cant change this classes and annotate the constructors with @Inject - we will just create the new ones.
    //@Provides tells Dagger to provide us with new object whenever requested by executing the annotated function.
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
            //We need core, so dagger will invoke provideCore to get it.
            //The same goes with liquid.
            return Extra(core, liquid)
        }
    //When we will need extra (in potion constructor) Dagger will call provideExtra from this module
}