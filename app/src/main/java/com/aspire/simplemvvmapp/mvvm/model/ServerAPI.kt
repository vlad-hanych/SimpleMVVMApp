package com.aspire.simplemvvmapp.mvvm.model

import okhttp3.ResponseBody
import retrofit2.http.GET
import rx.Observable

interface ServerAPI {
    @GET("/latest")
    fun doGetRequestTest(/*@Query("id") id: String*/): Observable<ResponseBody>
}