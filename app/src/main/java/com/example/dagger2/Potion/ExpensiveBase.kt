package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject
//TODO 2: Now we can inject our constructor here, since dagger knows how to provide energy
//Just to remind u. We pass the energy value to the module constructor in our Builder.
class ExpensiveBase @Inject constructor(val energy: Int): Base {

    private val TAG = "Potion"

    override fun prepare() {
        Log.d(TAG, "Expensive base prepared. Energy: "+energy)
    }
}