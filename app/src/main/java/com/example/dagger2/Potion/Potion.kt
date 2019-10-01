package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject
//TODO 2: Add volunteer as a field
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
