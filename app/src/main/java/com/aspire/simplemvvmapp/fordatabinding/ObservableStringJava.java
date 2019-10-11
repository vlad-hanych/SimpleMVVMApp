/*
package com.aspire.simplemvvmapp.databinding;

import android.databinding.BaseObservable;
import android.databinding.BindingConversion;

public class ObservableStringJava extends BaseObservable {

    private String value = "";

    public ObservableStringJava(String value) {
        this.value = value;
    }

    public ObservableStringJava() { }

    public String get() {
        return value != null ? value : "";
    }

    public void set(String value) {
        if (value == null) value = "";
        if (!this.value.contentEquals(value)) {
            this.value = value;
            notifyChange();
        }
    }

    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }

    public void clear() {
        set(null);
    }

    @BindingConversion
    public static String convertToString(
            ObservableString observableString) {
        return observableString.get();
    }
}
*/
