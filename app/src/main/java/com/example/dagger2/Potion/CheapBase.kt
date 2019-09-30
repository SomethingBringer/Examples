package com.example.dagger2.Potion

import android.util.Log
import javax.inject.Inject

class CheapBase @Inject constructor(): Base {

    private val TAG = "Potion"

    override fun prepare() {
        Log.d(TAG, "Cheap base prepared")
    }

}