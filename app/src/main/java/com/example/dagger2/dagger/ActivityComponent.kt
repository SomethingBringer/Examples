package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

//TODO 4: Update this component with dependence from appcomponent and update the builder
@PerActivity
@Component(dependencies = [AppComponent::class] ,modules = [ExtraModule::class, CheapBaseModule::class])
interface ActivityComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun energy(@Named("energy") energy: Int):Builder

        @BindsInstance
        fun stability(@Named("stability") stability: Int):Builder


        fun appComponent(component: AppComponent):Builder

        fun build():ActivityComponent
    }
}
