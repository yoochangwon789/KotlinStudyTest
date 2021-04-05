package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 1
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법 2
    // 내가 원하는 List 의 index 를 출려하는 방법
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
    }

    println()

    // 반복하는 방법 2 번과 동일한 방법 lambda 활용
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법 3
    // 내가 원하는 index 의 범위를 지정해서 출력하는 방법 앞의 0은 포함 마지막은 (3 - 1) 까지 2번째 까지 출력
    for (item in a.subList(0, 3)) {
        println(item)
    }

    println()

    // 반복하는 방법 4
    a.forEach {
        println(it)
    }

    // 반복하는 방법 5 it 을 굳이 사용하지 않고 이름을 바꿔서 사용하는 방법
    a.forEach { item ->
        println(item)
    }

    println()

    // 반복하는 방법 6
    // 0 부터 size - 1 까지 반복 until 은 마지막을 포함하지 않음
    for (i in 0 until a.size) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법 7
    // step 을 활용하면 index + step(2) 만큼 증가한다 0 2 4 6 8
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법 8
    // 8부터 0 까지 반복 거꾸로 출력
    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법 9
    // 거꾸로 반복하는 downTo 를 사용하고 step 을 사용하여 2칸씩 띄어서 출력 8 6 4 2 0
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    println()

    // 반복하는 방법 10
    // .. 을 사용하는 경우 마직막을 포함한다
    for (i in 0..a.size) {
        println(i)
    }

    println()

    // 반복하는 방법 11
    var a1: Int = 0
    var b1: Int = 4

    while (a1 < b1) {
        a1++
        println("b")
    }

    println()

    // 반복하는 방법 12
    // do 안에 있는 코드는 while 반복 조건을 만족하지 않더라도 무조건 한번은 출력한다
    var d: Int = 0
    var e: Int = 4
    do{
        println("hello")
        d++
    } while (d < e)
}