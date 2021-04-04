package com.example.kotlinstudy.Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부 함수
// 함수 안에 함수가 있다!!
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    return plus(first, second)
}

fun main(array: Array<String>) {
    val result: Int = plusThree(1, 2, 3)
    println(result)

    val result2: Int = minusThree(10, 1, 2)
    println(result2)

    val result3: Int = multiplyThree(2, 2, 2)
    println(result3)

    val result4: Int = multiplyThree()
    println(result4)

    println()

    val result5: Int = showMyPlus(4, 5)
    println(result5)
}