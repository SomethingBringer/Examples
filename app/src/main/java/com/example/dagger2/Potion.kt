package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Potion @Inject constructor (val base:Base, val extra: Extra) {
    //Tag for logs
    private val TAG = "Potion"


    fun effect(){
        Log.d(TAG,"some effect...")
    }
}
