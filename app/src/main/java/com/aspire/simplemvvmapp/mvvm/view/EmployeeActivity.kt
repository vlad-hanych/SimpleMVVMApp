package com.aspire.simplemvvmapp.mvvm.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.databinding.DataBindingUtil
import android.content.Intent
import com.aspire.simplemvvmapp.mvvm.view_model.implementations.EmployeeViewModel
import com.aspire.simplemvvmapp.R
import com.aspire.simplemvvmapp.databinding.ActivityEmployeeBinding
import com.aspire.simplemvvmapp.mvvm.view.abstractions.EmployeeViewAbstr

class EmployeeActivity : AppCompatActivity(), EmployeeViewAbstr {
    private lateinit var viewModel: EmployeeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityEmployeeBinding = DataBindingUtil.setContentView(EmployeeActivity@this,
            R.layout.activity_employee
        )

        viewModel = EmployeeViewModel(EmployeeActivity@ this)

        binding.employeeViewModel = viewModel
    }

    override fun onResume() {
        super.onResume()

        viewModel.onResume()

        /// тут, наприклад
        needToDoGetRequestTest ()

        /// тут, наприклад
        needToGetStatus ("some input data")

        /// тут, наприклад
        needToGetIsLoaded (7)

        /// тут, наприклад
        needToGetSalary(true)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        viewModel.onActivityResult(requestCode, resultCode, data!!)
    }

    /// TODO винести в інтерфейс
    override fun needToDoGetRequestTest () {
        viewModel.handleDoingGetRequestTest()
    }

    override fun needToGetStatus(someInputData: String) {
        viewModel.handleGettingStatus(someInputData)
    }

    override fun needToGetIsLoaded(someInputData: Int) {
        viewModel.handleGettingIsLoaded(someInputData)
    }

    override fun needToGetSalary(someInputData: Boolean) {
        viewModel.handleGettingSalary(someInputData)
    }
}
