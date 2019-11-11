package com.aspire.simplemvvmapp

import android.app.Application
import com.aspire.simplemvvmapp.di.components.AppComponent
import com.aspire.simplemvvmapp.di.components.DaggerAppComponent
import com.aspire.simplemvvmapp.di.modules.AppModule

class App : Application() {
    companion object {
        lateinit var instance: App private set
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        instance = this@App

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(instance))
            .build()
    }
}