package com.example.kotlinstudy.Kotlin

// 12. 배열

fun main(array: Array<String>) {

    // 배열을 생성하는 방법 1
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)

    // is Array 는 Array 타입이 맞는지 확인 하는 것 True, False 반환
    println(group1 is Array)

    // 배열을 생성하는 방법 2
    var group2 = arrayOf(1, 2, 3, 3.5, "Hello")

    // 배열의 값을 꺼내는 방법 1
    var test1 = group1.get(1)
    var test2 = group1.get(4)
    println(test1)
    println(test2)

    // 배열의 값을 꺼내는 방법 2
    var test3 = group1[0]
    println(test3)

    // 배열의 값을 바꾸는 방법 1
    group1.set(0, 100)
    var test4 = group1.get(0)
    println(test4)

    // 배열의 값을 바꾸는 방법 2
    group1[0] = 200
    println(group1[0])
}