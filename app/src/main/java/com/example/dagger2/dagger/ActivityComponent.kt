package com.example.dagger2.dagger

import com.example.dagger2.MainActivity
import com.example.dagger2.Potion.Potion
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [ExtraModule::class, ExpensiveBaseModule::class])
interface ActivityComponent {
    fun getPotion(): Potion
    fun inject(mainActivity: MainActivity)

//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        fun energy(@Named("energy") energy: Int):Builder
//
//        @BindsInstance
//        fun stability(@Named("stability") stability: Int):Builder
//
//
//        fun appComponent(component: AppComponent):Builder
//
//        fun build():ActivityComponent
//    }
}
