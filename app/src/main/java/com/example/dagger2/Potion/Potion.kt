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
        //TODO 6: invoke base.prepare. Run the app and watch the logs. Swap the module in the component and ty again.
        base.prepare()
        Log.d(TAG,"some effect...")
    }
}
