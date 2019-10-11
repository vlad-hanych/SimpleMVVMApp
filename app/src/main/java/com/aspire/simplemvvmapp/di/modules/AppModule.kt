package com.aspire.simplemvvmapp.di.modules

import android.app.Application
import android.content.Context
import com.aspire.simplemvvmapp.mvvm.DataManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {
    @Provides
    @Singleton
    fun provideContext(): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideDataManager(): DataManager {
        return DataManager()
    }
}