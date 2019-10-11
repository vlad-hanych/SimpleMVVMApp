package com.aspire.simplemvvmapp.mvvm.view_model.abstractions

interface EmployeeViewModelAbstr {
    fun handleDoingGetRequestTest()
    fun handleGettingStatus(someInputData: String)
    fun handleGettingIsLoaded(someInputData: Int)
    fun handleGettingSalary(someInputData: Boolean)
}