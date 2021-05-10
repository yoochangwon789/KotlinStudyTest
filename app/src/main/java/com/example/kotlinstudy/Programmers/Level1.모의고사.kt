package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    val solution = Solution()

    val answers = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    println(solution.solution(answers))

}

class Solution {
    fun solution(answers: IntArray): MutableList<Int> {
        var answer = mutableListOf<Int>()

        var top1: Int = 0
        var top2: Int = 0
        var top3: Int = 0

        var one: Int = 0
        var two: Int = 0
        var three: Int = 0

        val oneMath = arrayOf<Int>(1, 2, 3, 4, 5)
        val twoMath = arrayOf<Int>(2, 1, 2, 3, 2, 4, 2, 5)
        val threeMath = arrayOf<Int>(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        for (i in 0 until answers.size) {
            if (top1 > 4) top1 = 0
            if (oneMath[top1] == answers[i]) one++

            if (top2 > 7) top2 = 0
            if (twoMath[top2] == answers[i]) two++

            if (top3 > 9) top3 = 0
            if (threeMath[top3] == answers[i]) three++

            top1++
            top2++
            top3++
        }

        val listIntArray = mutableListOf<Int>()

        listIntArray.add(one)
        listIntArray.add(two)
        listIntArray.add(three)

        var max: Int = Math.max(Math.max(one, two), three)
        if (max == listIntArray.get(0)) answer.add(1)
        if (max == listIntArray.get(1)) answer.add(2)
        if (max == listIntArray.get(2)) answer.add(3)

        return answer
    }
}