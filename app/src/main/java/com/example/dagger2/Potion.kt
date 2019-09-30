package com.example.dagger2

import android.util.Log
import javax.inject.Inject
//Now lets imagine that our extra class comes from a third party library. So this class is external and we cant make any changes to it.
//TODO 1: Create liquid and core classes
class Potion @Inject constructor (val base:Base, val extra: Extra) {
    //Tag for logs
    private val TAG = "Potion"

    @Inject
    fun stabilize(stabilizer: Stabilizer){
        stabilizer.setListener(this)
    }

    fun effect(){
        Log.d(TAG,"some effect...")
    }
}
