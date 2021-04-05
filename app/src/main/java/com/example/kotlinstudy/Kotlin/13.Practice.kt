package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
    println(number)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    // Array 를 만드는 방법 3
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.1, 1.3, 10.5)
    val a4 = booleanArrayOf(true, false, true, false)

    // Array 를 만드는 방법 4 -> lambda 를 활용한 방법
    // 인자 1개만 넣으면 0부터 9까지 0으로만 채워진다
    var a5 = Array(10, { 0 })
    // 세미콜론으로 쉼표 역할을 함
    var a6 = Array(5, { 1;2;3;4;5; })
}

