package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Potion @Inject constructor (val base:Base, val extra: Extra) {
    //Tag for logs
    private val TAG = "Potion"
    //TODO 1: Read this
    //Now we add another method to our potion class. After our potion is created we want to stabilize it.
    //We need stabilizer object. Call setListener on it and pass the potion instance itself with this.
    //And this is really the only good use case to use method injection - if u have to pass the injected object itself to the dependency
    //Because if we pass it in the constructor - then we r trying to pass an object that r not yet fully instantiated.
    //By annotating method with @Inject - dagger will automatically call this method after the constructor is finished.
    //Remember the order in which dagger works
    //1)Constructor injection
    //2)Field injection
    //3)Method injection
    //TODO 3: Write a method and annotate it with @Inject
    @Inject
    fun stabilize(stabilizer: Stabilizer){
        stabilizer.setListener(this)
    }
    //TODO 4: Run the project and watch for logs.
    //@Inject can be used on 1)Constructors, 2)Fields, 3)Methods
    //@Inject tells dagger to provide us with something (whether its object, field or method execution)
    fun effect(){
        Log.d(TAG,"some effect...")
    }
}
