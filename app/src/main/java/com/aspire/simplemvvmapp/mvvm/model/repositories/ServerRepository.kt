package com.aspire.simplemvvmapp.mvvm.model.repositories

import com.aspire.simplemvvmapp.App
import com.aspire.simplemvvmapp.mvvm.model.ServerAPI
import okhttp3.ResponseBody
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class ServerRepository {
    @Inject
    lateinit var serverAPI: ServerAPI

    init {
        App.instance.appComponent.inject(this@ServerRepository)
    }

    fun launchDoingGetRequestTest(id: String): Observable<ResponseBody> {
        return serverAPI.doGetRequestTest(/*id*/)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
    }
}