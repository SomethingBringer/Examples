package com.example.dagger2.dagger

import com.example.dagger2.Potion.Volunteer
import dagger.Component
import javax.inject.Singleton
@Singleton
@Component (modules = [VolunteerModule::class])
interface AppComponent {
    fun getActivityComponent(expensiveBaseModule: ExpensiveBaseModule):ActivityComponent
}