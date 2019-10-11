package com.aspire.simplemvvmapp.mvvm.view_model.implementations

import android.content.Intent
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableInt
import com.aspire.simplemvvmapp.App
import com.aspire.simplemvvmapp.mvvm.DataManager
import com.aspire.simplemvvmapp.mvvm.view.EmployeeActivity
import com.aspire.simplemvvmapp.mvvm.view_model.ActivityViewModel
import com.aspire.simplemvvmapp.mvvm.view_model.abstractions.EmployeeViewModelAbstr
import okhttp3.ResponseBody
import rx.Subscriber
import javax.inject.Inject

class EmployeeViewModel (private val employeeActivity: EmployeeActivity) : ActivityViewModel<EmployeeActivity>(employeeActivity),
    EmployeeViewModelAbstr {
    /// TODO переробити відслідковувані поля по такій аналогії:
    /*public ObservableField<String> name = new ObservableField<>();

    public ObservableInt salary = new ObservableInt();*/

    @Inject
    lateinit var dataManager: DataManager

    ///public var status = ObservableString()
    public var status = ObservableField<String>()

    public var isLoaded = ObservableBoolean(false)

    public var salary = ObservableInt()

    public var result = ObservableField<String>()

    init {
        status.set("PlYceholder.")

        ///isLoaded.set(false)

        App.instance.appComponent.inject(this@EmployeeViewModel)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {

    }

    override fun onResume() {

    }

    override fun handleDoingGetRequestTest() {
        dataManager.manageDoingGetRequestTest("qqq").subscribe(object : Subscriber<ResponseBody>() {
            override fun onCompleted() {

            }

            override fun onError(e: Throwable) {
                /*getView()!!.onBackEndError(e.localizedMessage)*/
            }

            override fun onNext(response: ResponseBody) {
                val resultString = response.string()

                ///Log.d("handleDoingGetRequestTest_resultString", resultString)

                result.set(resultString)
            }
        })
    }

    override fun handleGettingStatus(someInputData: String) {
        /// TODO call for data

        status.set("Statusoff.")
    }

    override fun handleGettingIsLoaded(someInputData: Int) {
        /// TODO call for data

        isLoaded.set(true)
    }

    override fun handleGettingSalary(someInputData: Boolean) {
        /// TODO call for data

        salary.set(7777777)
    }

    override fun onDestroy() {
    /// TODO clean ups
    }
}