package com.example.kotlinstudy.Kotlin

// - 함수를 선언하는 방법
//     fun 함수명 (변수명 : 타입, 변수명 : 타입...) : 반환형 {
//          // 함수내용
// return 반환 값
//     }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
// Unit >> 유닛이라고 명시한 함수는 아무런 값도 return 하지
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// Unit 은 생략이 가능하다
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법, 인수를 선언하고 여러개를 받을 수 있다. >> vararg 사용
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {

    val result: Int = plus(3, 4)
    println(result)

    val result2: Int = plusFive(1)
    println(result2)

    println(printPlus(10, 20))

    val result3: Int = plusShort(50, 20)
    println(result3)

    println(plusMany(1, 2, 3))
}

