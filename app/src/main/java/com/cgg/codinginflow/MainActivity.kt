package com.cgg.codinginflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

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

//        dataTypes()
//        arrays()
        loops()
    }
}

fun dataTypes() {
    val exNum = 2.0E-3
    Log.e(TAG, "test: $exNum");
    Log.e(TAG, "My name is $userName")

    val exLong: Long = 9223372036854775807L
    val exInt: Int = exLong.toInt()

    Log.e(TAG, "test: $exInt")

    val exINt1: Int = 2147483647
    val exLong1: Long = exINt1.toLong()
    Log.e(TAG, "test: $exLong1")

    val exFloat: Float = 123.6f
    val exLong2: Long = exFloat.toLong()
    Log.e(TAG, "test f: $exLong2")

    val exChar: Char = 'A'
    val exInt3: Int = exChar.toInt()
    Log.e(TAG, "test ff: $exInt3")

    val exINt4: Int = 998
    val exChar2: Char = exINt4.toChar()
    Log.e(TAG, "test fff: $exChar2")

    val exString: String = "\"Naren\""
    Log.e(TAG, "test name: $exString")

    val exRawStr: String = """ Naren 
|                              Raw""".trimMargin()
    Log.e(TAG, "test: $exRawStr")


    val testString: String = "";
    Log.e(TAG, "test: $testString")
}

fun arrays() {
    val names: Array<String> = arrayOf("Naren", "Suma", "Baby")
    names[0] = "King"
    Log.e(TAG, "arrays: ${names[2]}")
    Log.e(TAG, "arrays: ${names.last()}")

    val comArray = arrayOf(1, "King", false)
    Log.e(TAG, "arrays f: ${comArray[0]}")

    val tdArray = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10)
    )

    Log.e(TAG, "arrays: ${tdArray[2][1]}")
}

fun loops() {
    val names = arrayOf("King", "Queen", "Minister", "Thief")

    for (name in names) {
        Log.e(TAG, "loops: $name")
    }

    for (i in 1..10) Log.e(TAG, "loops: $i") // prints 1 to 10 -- in incremental order
    for (i in 1 until 10) Log.e(
        TAG,
        "loops: $i"
    )// prints 1 to 9 and excludes 10 -- must be in incremental order
    for (i in 10 downTo 1) Log.e(TAG, "loops: $i")// prints 10 to 1 --in decremental order
    for (i in 1..10 step 2) Log.e(
        TAG,
        "loops: $i"
    ) // prints 1,3,5,7,9 - By skipping one number  1 stepof(2) ==3, 3stepof(2) == 5...

    for (i in 'a'..'z' step 2) Log.e(TAG, "loops: $i")

    for (i in names.indices) {
        Log.e(TAG, "loops: Index: $i and Element: ${names[i]}")
    }

    val condition = (2 > 1) || (3 > 2) && (2 > 3) // true || true && false
    Log.e(TAG, "loops: ${!condition}")
    Log.e(TAG, "loops: ${true || true && false}")

//    i++ vs ++i   i++ first print value then increment ++i first increment then prints
    var i = 0;

    while (i < 5) {
        print(i++) // prints 0 then increment to 1

    }

    i = 0;
    while (i < 5) {
        print(++i)// increment 0 to 1 then print 1
    }

    i = 0
    do {
        i++
        Log.e(TAG, "loops do-while: $i")
    } while (i < 5)

    i = 100
    do {
        Log.e(TAG, "loops: $i")
        i /= 2;
    } while (i != 1)

    i = 8
    var times =0;

    while (i > 1) {
        i /= 2
        Log.e(TAG, "loops: $i")
        times++
    }

    Log.e(TAG, "loops: 100/2 times: $times" )

}