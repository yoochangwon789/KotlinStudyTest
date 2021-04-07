package com.example.kotlinstudy.Kotlin

fun testList(): Unit{
    val oneList = mutableListOf<Int>()
    val twoList = mutableListOf<Boolean>()

    for (i in 0..9) {
        oneList.add(i)
    }

    println(oneList)

    for (i in 0 until oneList.size) {
        if (oneList.get(i) % 2 == 1) {
            twoList.add(false)
        } else {
            twoList.add(true)
        }
    }

    println(twoList)
}

fun testResult(point: Int): String {
    var result: String = ""

    if (59 >= point && 91 <= point) {
        result = "점수의 범위를 초과하였습니다"
    }else {
        when (point) {
            in 80..90 -> result = "A"
            in 70..79 -> result = "B"
            in 60..69 -> result = "C"
            else -> result = "F"
        }
    }

    return result
}

fun pointSum(number: Int): Int {
    val firstNumber: Int = number / 10
    val secondNumber: Int = number % 10
    val result: Int = firstNumber + secondNumber

    return result
}

fun gugudan(): Unit {

    for (i in 1..9) {
        var one: String = i.toString()
        for (j in 1..9) {
            println(one + " x " + j + " = " + i*j)
        }
        println()
    }
}

fun main(array: Array<String>) {
    testList()
    println(testResult(80))
    println(testResult(87))
    println(testResult(77))
    println(testResult(59))
    println(testResult(97))

    println(pointSum(52))

    gugudan()
}