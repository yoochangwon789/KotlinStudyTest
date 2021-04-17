package com.example.kotlinstudy.람다식

fun main(array: Array<String>) {

    var sum = {x: Int, y: Int -> print("$x 와 $y 값을 더한값 ")
        x + y
    }

    val list = mutableListOf(1,3,4,5)

    var max = list[0]
    for (i in 1 until list.size) {
        if (max < list[i]) max = list[i]
    }

    println(sum(1,2))
    println(max)
}
