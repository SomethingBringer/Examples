package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject

class Potion @Inject constructor (val base: Base, val extra: Extra) {

    private val TAG = "Potion"

    @Inject
    fun stabilize(stabilizer: Stabilizer){
        stabilizer.setListener(this)
    }

    fun effect(){
        base.prepare()
        Log.d(TAG,"some effect...")
    }
}
