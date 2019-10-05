package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton


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
