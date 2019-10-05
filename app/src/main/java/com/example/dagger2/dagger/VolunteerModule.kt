package com.example.dagger2.dagger

import com.example.dagger2.Potion.Volunteer
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
@Module
object VolunteerModule {
    @Provides
    @JvmStatic
    @Singleton
    fun provideVolunteer():Volunteer{
        return Volunteer()
    }
}