package com.aspire.simplemvvmapp.mvvm.view.abstractions

interface EmployeeViewAbstr {
    fun needToDoGetRequestTest()
    fun needToGetStatus(someInputData: String)
    fun needToGetIsLoaded(someInputData: Int)
    fun needToGetSalary(someInputData: Boolean)
}