package com.aspire.simplemvvmapp.di.components

import com.aspire.simplemvvmapp.*
import com.aspire.simplemvvmapp.di.modules.AppModule
import com.aspire.simplemvvmapp.di.modules.RetrofitModule
import com.aspire.simplemvvmapp.mvvm.DataManager
import com.aspire.simplemvvmapp.mvvm.model.repositories.ServerRepository
import com.aspire.simplemvvmapp.mvvm.view_model.implementations.EmployeeViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RetrofitModule::class])
interface AppComponent {
    fun inject(app: App)
    fun inject(serverRepository: ServerRepository)
    fun inject(dataManager: DataManager)
    fun inject(employeeViewModel: EmployeeViewModel)
}