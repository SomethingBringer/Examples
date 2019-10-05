package com.example.dagger2.dagger

import com.example.dagger2.Potion.Volunteer
import dagger.Component
import javax.inject.Singleton
//TODO 2: Create getter method for volunteer. For the sake of example create a Volunteer module and change volunteer class
@Singleton
@Component (modules = [VolunteerModule::class])
interface AppComponent {

    fun getVolunteer(): Volunteer
}