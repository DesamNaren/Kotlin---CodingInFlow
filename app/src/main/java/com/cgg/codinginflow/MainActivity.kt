package com.cgg.codinginflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private var TAG: String? = MainActivity::class.java.canonicalName
private var Value: String? = MainActivity::class.java.canonicalName

var userName: String = "Naren"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Value = null
        if (Value == null) Log.e(TAG?.length.toString(), "Value is : -1")
        else Log.e(TAG?.length.toString(), "Value is: $Value")

        test()
    }
}

fun test() {
    Log.e(TAG, "My name is $userName")
}