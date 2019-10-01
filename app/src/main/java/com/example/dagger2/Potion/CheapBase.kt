package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
//TODO 4: But what if we want to provide 2 objects of the same type (Ignore the @Named annotation for now)
class CheapBase @Inject constructor(@Named("energy") val energy: Int,
                                    @Named("stability") val stability :Int): Base {

    private val TAG = "Potion"

    override fun prepare() {
        Log.d(TAG, "Cheap base prepared. Energy: "+ energy+" \n Stability: "+stability)
    }

}