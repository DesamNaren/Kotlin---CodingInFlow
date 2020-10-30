package com.cgg.codinginflow

var topLevelVariable = "bbbb" // top level variables must be assigned to value

val v = changeVal()
//const val c = changeVal()-- CPE (Compile Time Error)


//You can declare the ‘const’ variable only if a variable is
//1. top-level or member of the object or member of a companion object.
//2. must be initialized with a String type or primitive type.
//3. no custom getter.

//Kotlin
//Difference between val and const in Kotlin
//‘const’ is also known as a Compile-time constant.
// So you cannot assign value to the ‘const’ type variable on runtime.
// On the other hand, ‘val’ type variable can be assigned on runtime.
// That’s why we can say ‘val’ type constants are runtime constants.

fun changeVal(): Int {
    return 11
}

fun main() {


    println("Om Sai Ram$$")

    var localVariable: String // local variables do not require a value to assign, but type has to define

    val x = 10
    val y = 15
    val z = 25

    println(getMax(getMax(x, y), z))
    println(getMin(getMin(x, y), z))

//    funOverload(2,"Naren", "How R U")
    funOverload(2, name = "Naren", message = "How R U")

    getSum(num3 = 3, num4 = 4)


    val array = intArrayOf(1, 3, 11, 5, 7, 9)
    getTotal(*array) // * is spread operator

    getLarge(*array)


    userObj()
}


fun userObj() {
    val user = User("Naren", 30)
    println("${user.name} ${user.age}")
}


class User(val name: String, val age: Int) {

}

fun getLarge(vararg numbers: Int) {
    var max = numbers[0];
    for (number in numbers) {

        if (max < number) {
            max = number
        }
    }
    println("MAX is $max")
}

fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
fun getMin(num1: Int, num2: Int) = if (num1 < num2) num1 else num2

fun funOverload(rep: Int, name: String, message: String) {
    for (i in 0 until rep) println("Hi, I am $name!! $message!!")// excludes 2 print 0 and 1 times
}

fun getSum(
    num1: Int = 0,
    num2: Int = 0,
    num3: Int,
    num4: Int
) {
    println(num1.plus(num2.plus(num3).plus(num4)))
}


fun getTotal(vararg numbers: Int) {
    var sum = 0
    for (number in numbers) sum += number
    println("$sum")
}


