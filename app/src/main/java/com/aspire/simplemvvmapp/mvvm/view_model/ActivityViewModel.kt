package com.aspire.simplemvvmapp.mvvm.view_model

import android.content.Intent
import android.databinding.BaseObservable
import android.support.v7.app.AppCompatActivity

abstract class ActivityViewModel<A : AppCompatActivity>(activity: A) : BaseObservable() {
    var activity: A
        protected set

    init {
        this.activity = activity
    }

    abstract fun onResume()

    abstract fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent)

    abstract fun onDestroy()
}