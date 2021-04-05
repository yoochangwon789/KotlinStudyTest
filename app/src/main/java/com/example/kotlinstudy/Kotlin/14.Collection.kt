package com.example.kotlinstudy.Kotlin

// 14. Collection

// list, set, map

// List

fun main(args: Array<String>) {

    // Immutable Collection >> 처음 만들면 바꿀 수 없는 Collection >>> 변수 설정 할 때 val 라고 생각하면 된다

    // List
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)

    // Set -> 중복을 허용하지 않는다
    // 순서가 없다 그러므로 get 메서드가 없음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))


    // Mutable Collections >> 값이 변경가능한 Collection >>> 변수 설정 할 때 var 라고 생각하면 된다

    // List
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    // Set
    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println(mNumberSet)

    //Map
    val mNumberMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    mNumberMap.put("three", 3)
    println(mNumberMap)
}