package com.example.dagger2.Potion

import android.util.Log
import com.example.dagger2.dagger.PerActivity
import javax.inject.Inject
@PerActivity
class Potion @Inject constructor (val base: Base, val extra: Extra, val volunteer: Volunteer) {

    private val TAG = "Potion"

    @Inject
    fun stabilize(stabilizer: Stabilizer){
        stabilizer.setListener(this)
    }

    fun effect(){
        base.prepare()
        Log.d(TAG,volunteer.toString() +" is testing " + this)
    }
}
