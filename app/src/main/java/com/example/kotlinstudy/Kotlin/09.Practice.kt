package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c equal 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자 Kotlin 은 null 세이프티 언어 엘비스 연산자가 그 예시
    // null 의 대한 대응을 하는 문법적 요소 엘비스 연산자는 알아두자
    // number 라는 변수가 null 일 경우 number2에는 10이 들어간다 number2 처럼 표기
    val number: Int? = null
    val number2 = number ?: 10

    // number3 에 null 값이 아니라 100이면 number3 은 10이 아니라 100 이 들어간다
    val number3: Int? = 100
    val number4 = number3 ?: 10

    println()
    println(number2)
    println(number3)
    println(number4)

    val num1: Int = 10
    val num2: Int = 20

    // 값을 리턴 하는 값의 조건이 무조건 있어야 한다 없는 경우는 에러 그러므로 else 를 사용해라
    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }
}
