package com.example.kotlinstudy.Programmers

import com.example.kotlinstudy.KotilnCodingTest.solution

fun main(array: Array<String>) {


}

class DotProduct {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        for (i in 0 until a.size) {
            answer += a[i] * b[i]
        }

        return answer
    }
}