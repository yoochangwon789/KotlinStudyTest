package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    val left = 24
    val right = 27

    val measureOfSum = MeasureOfSum()

    println(measureOfSum.solution(left, right))
}

class MeasureOfSum {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var top = left
        val numList = mutableListOf<Int>()

        while (true) {
            numList.add(top)
            top++

            if (top > right) break
        }

        for (i in 0 until measure(numList).size) {
            answer += measure(numList)[i]
        }

        return answer
    }

    fun measure(numList: MutableList<Int>): MutableList<Int> {

        val numResultList = mutableListOf<Int>()

        for (i in 0 until numList.size) {
            var check: Int = 0
            for (j in 1..numList[i]) {
                if (numList[i] % j == 0) {
                    check++
                }
            }
            if (check % 2 == 0) numResultList.add(numList[i])
            else numResultList.add(numList[i] * - 1)
        }

        return numResultList
    }
}