package com.example.kotlinstudy.Kotlin

// 11. 제어흐름 실습

fun main(args: Array<String>) {
    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }

    // 값을 리턴하는 when 구문의 경우 반드시 값을 리턴해야 함
    val value3 = when (value2) {
        true -> 1
        false -> 2
        null -> 3
    }

    val value4: Int = 10

    // is 는 타입을 묻는 문법 value4가 Int 형이냐 라고 확인
    // when 의 다양한 조건식
    when (value4) {
        is Int -> {
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    // when 다양한 조건식 2
    val value5: Int = 70

    // in 은 범위 설정할때 60..70 은 60 부터 70 처음과 마지막 숫자를 포함
    when (value5) {
        in 60..70 -> {
            println("value5 is 60..70")
        }
        in 70..80 -> {
            println("value5 is 60..70")
        }
        in 80..90 -> {
            println("value5 is 60..70")
        }
    }
}