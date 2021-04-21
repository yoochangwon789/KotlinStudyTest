package com.example.kotlinstudy.람다식

fun main(array: Array<String>) {

    // 익명함수를 생성하여 greeting에 할당
    // 익명함수가 할당되는 변수에 인자와 리턴 타입이 정의되어 있다면 이를 생략할 수 있다
    val greeting: (String, String) -> String = { name, age -> "Hello. My name is $name. i'm $age year old" }

    val result = greeting("ChangWon", "26")
    println(result)

    // 인자가 1개일 때 선언을 생략 접근하려면 it으로 접근
    val greeting1: (String) -> String = { "Hello. My name is $it." }

    val result2 = greeting1("IU")
    println(result2)

    // 라이브러리에서 사용되는 익명함수
    val numberList = listOf<Int>(5, 1, 3, 2, 9, 6, 7, 8, 4)

    val sorted = numberList.sortedBy { it }
    println(sorted)

    val biggerThan5 = numberList.sortedBy { it }.filter { it > 5 }
    println(biggerThan5)
}