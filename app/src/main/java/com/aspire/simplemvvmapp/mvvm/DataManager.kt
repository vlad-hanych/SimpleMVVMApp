package com.aspire.simplemvvmapp.mvvm

import com.aspire.simplemvvmapp.App
import com.aspire.simplemvvmapp.mvvm.model.repositories.ServerRepository
import okhttp3.ResponseBody
import rx.Observable
import javax.inject.Inject

class DataManager {
    @Inject
    lateinit var serverRepository: ServerRepository

    init {
        App.instance.appComponent.inject(this@DataManager)
    }

    fun manageDoingGetRequestTest(id: String): Observable<ResponseBody> {
        return serverRepository.launchDoingGetRequestTest(id)
    }
}