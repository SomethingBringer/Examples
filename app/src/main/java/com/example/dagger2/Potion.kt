package com.example.dagger2

import android.util.Log
import javax.inject.Inject

//Our potion will consist of base and extra fields. So create a constructor for this class and annotate it with @Inject.
//@Inject annotation shows Dagger how to provide us with instance of a class
//TODO 4: Create a constructor and annotate it with @Inject
class Potion @Inject constructor (val base:Base, val extra: Extra) {
    //Tag for logs
    private val TAG = "Potion"

    //Some function for logging our effect. Just to see if dagger works fine
    fun effect(){
        Log.d(TAG,"some effect...")
    }
}
//TODO 5: Create a Component interface