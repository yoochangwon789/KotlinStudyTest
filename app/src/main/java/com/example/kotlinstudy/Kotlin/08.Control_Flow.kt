package com.example.kotlinstudy.Kotlin

// 08. 제어흐름
// - if, else


fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if else 사용 방법 1
    if (a > b) {
        println("a 가 b 보다 크다")
    } else {
        println("a 가 b 보다 작다")
    }

    // if else 사용 방법 2
    if (a > b) {
        println("a가 b 보다 크다")
    }

    // else if 사용 방법
    if (a > b) {
        println("a 가 b 보다 크다")
    } else if (a < b) {
        println("a 가 b 보다 작다")
    } else {
        println("a 와 b는 같다")
    }

    // 값을 return 하는 if
    val max = if (a > b) {
        a
    } else {
        b
    }

    val max2 = if (a > b) a else

    println()
    println(max)
}