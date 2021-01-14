package com.valerasetrakov.mylibrary

import android.util.Log

object TestObject {
    fun log(message: String) {
        Log.d(TestObject::class.simpleName, message)
    }
}