package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject

//TODO 2: create two classes that implements our interface
class ExpensiveBase @Inject constructor(): Base {

    private val TAG = "Potion"

    override fun prepare() {
        Log.d(TAG, "Expensive base prepared")
    }
}