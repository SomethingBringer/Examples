package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [ExtraModule::class, CheapBaseModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)

    //TODO 5: Now we need to create our builder by @Component.Builder over nested interface Builder
    @Component.Builder
    interface Builder{
        //TODO 7: Now write functions for our values. Try this without @Named annotation.
        //U will see an error - u r asking for int and dagger don't know which one to take. That's why we need @Named annotation
        //This way we can tell dagger which value belongs to which field
        @BindsInstance
        fun energy(@Named("energy") energy: Int):Builder

        @BindsInstance
        fun stability(@Named("stability") stability: Int):Builder

        //TODO 6: write the build fun that will return our component. Do not forget to change modules of the component
        fun build():PotionComponent
    }
}
