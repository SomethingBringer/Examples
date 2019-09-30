package com.example.dagger2

import android.util.Log
import javax.inject.Inject

//TODO 2: Create new class, annotate constructor with @Inject and write the setListener method
class Stabilizer @Inject constructor(){
    private val TAG = "Potion"

    fun setListener(potion: Potion){
        Log.d(TAG,"Potion stabilized")
    }
}