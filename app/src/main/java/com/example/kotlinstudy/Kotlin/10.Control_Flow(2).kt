package com.example.kotlinstudy.Kotlin

// 10. 제어흐름

// When

fun main(array: Array<String>) {
    val value: Int = 1

    // if 문 처럼 조건이 무조건 들어갈 필요는 없다
    // -> 이 표기를 사용해 1일 때 2일 때 3일 때 이것을 출력하겠다 라는 의미
    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }

    // 위의 when 문법을 if 문으로 변경했을 때 작업
    if (value == 1) println("value is 1")
    else if (value == 2) println("value is 2")
    else if (value == 3) println("value is 3")
    else println("I do not know value")

    // when 을 값을 넣어서 사용하는 경우
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }

    println(value2)
}