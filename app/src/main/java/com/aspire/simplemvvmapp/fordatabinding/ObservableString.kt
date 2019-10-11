/*
package com.aspire.simplemvvmapp.databinding

import android.databinding.BaseObservable
import android.databinding.BindingConversion

class ObservableString : BaseObservable {

    private var value: String? = ""

    val isEmpty: Boolean
        get() = value == null || value!!.isEmpty()

    constructor(value: String) {
        this.value = value
    }

    constructor() {}

    fun get(): String {
        return if (value != null) value!! else ""
    }

    fun set(value: String?) {
        var value = value
        if (value == null) value = ""
        if (!this.value!!.contentEquals(value)) {
            this.value = value
            notifyChange()
        }
    }

    fun clear() {
        set(null)
    }

    companion object {

        @BindingConversion
        fun convertToString(
            observableString: ObservableString
        ): String {
            return observableString.get()
        }
    }
}*/
