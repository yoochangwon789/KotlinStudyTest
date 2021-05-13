package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    val absolutes = intArrayOf(1,2,3)
    val sings = booleanArrayOf(false, false, true)
    val minusPlusPlus = MinusPlusPlus()

    println(minusPlusPlus.solution(absolutes, sings))
}

class MinusPlusPlus() {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        var checkArray = mutableListOf<Int>()

        for (i in signs.indices) {
            if (signs[i] == false) checkArray.add(absolutes[i] * - 1)
             else checkArray.add(absolutes[i])
        }

        for (i in checkArray.indices) {
            answer += checkArray[i]
        }

        return answer
    }
}