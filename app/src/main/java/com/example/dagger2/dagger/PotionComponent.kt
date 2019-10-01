package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

//If we use @Singleton class in the component - we need to make our component @Singleton
//TODO 5: Annotate with @Singleton. Run the project and watch for logs
//@Singleton can also be used on @Provides methods is u cant inject object an should provide it
//The thing is - @Singleton works within the same component.
//So if u make 2 components and get 1 potion from each of them - u will get different volunteers.
@Singleton
@Component(modules = [ExtraModule::class, CheapBaseModule::class])
interface PotionComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun energy(@Named("energy") energy: Int):Builder

        @BindsInstance
        fun stability(@Named("stability") stability: Int):Builder

        fun build():PotionComponent
    }
}
