package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject

class ExpensiveBase @Inject constructor(val energy: Int): Base {

    private val TAG = "Potion"

    override fun prepare() {
        Log.d(TAG, "Expensive base prepared. Energy: "+energy)
    }
}