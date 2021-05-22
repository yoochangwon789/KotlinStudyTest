package com.example.kotlinstudy.Programmers

import java.util.*

fun main(array: Array<String>) {

    val aArray = intArrayOf(93, 30, 55)
    val bArray = intArrayOf(1, 30, 5)

    val functionDevelopment = FunctionDevelopment()
    println(functionDevelopment.solution(aArray, bArray))
}

class FunctionDevelopment() {
    fun solution(progresses: IntArray, speeds: IntArray): MutableList<Int> {
        var answer = mutableListOf<Int>()

        var stack = Stack<Int>()

        var top: Int = 1
        var check: Int = 0

        val checkArray = mutableListOf<Int>()

        for (i in progresses.indices) {
            if ((100 - progresses[i]) % speeds[i] >= 1) {
                check = (100 - progresses[i]) / speeds[i] + 1
                stack.push(check)
            } else {
                check = (100 - progresses[i]) / speeds[i]
                stack.push(check)
            }
            check = 0
        }

        // 7, 3, 9
        println(stack)

        

        return answer
    }
}