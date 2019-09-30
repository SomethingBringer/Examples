package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject


class Stabilizer @Inject constructor(){
    private val TAG = "Potion"

    fun setListener(potion: Potion){
        Log.d(TAG,"Potion stabilized")
    }
}