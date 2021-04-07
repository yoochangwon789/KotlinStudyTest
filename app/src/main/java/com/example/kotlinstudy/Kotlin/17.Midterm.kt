package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    first()
    println(third(23))
    gugudanTest()
}
fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            list2[index] = true
        } else {
            list2[index] = false
        }
        // 짧은 코딩 : list2[index] = value % 2 == 0 >>> boolean 형태는 조건값을 넣어서 표현이 가능
    }

    println(list2)
}

fun second(score: Int): String {
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}

fun third(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10

    return a + b
}

fun gugudanTest() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x x $y = ${x*y}")
        }
        println()
    }
    println()
}