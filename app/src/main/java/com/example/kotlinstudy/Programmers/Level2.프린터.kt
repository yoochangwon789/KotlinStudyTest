package com.example.kotlinstudy.Programmers

import java.util.*
import kotlin.collections.ArrayList

fun main(array: Array<String>) {

    val priorities = intArrayOf(2,1,3,2)
    val location: Int = 2

    val printer = Printer()
    printer.solution(priorities, 2)
}

class Printer() {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0

        var queueArray = ArrayList<Int>()
        var queueCheck = ArrayList<Int>()

        for (i in priorities.indices) {
            queueArray.add(priorities[i])
            queueCheck.add(i)
        }

        while (true) {

            var num: Int = queueArray[0]
            var num2: Int = queueCheck[0]

            queueArray.remove(0)
            queueArray.remove(0)

        }

        println(queueArray)
        println(queueCheck)

        return answer
    }
}