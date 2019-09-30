package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject
//TODO 1: Let's say that we need to pass some arguments in runtime.
//We cant inject this constructor so delete @Inject
class ExpensiveBase(val energy: Int): Base {

    private val TAG = "Potion"

    override fun prepare() {
        //Upgrade our function
        Log.d(TAG, "Expensive base prepared. Energy: "+energy)
    }
}