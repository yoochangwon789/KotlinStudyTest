package com.example.kotlinstudy.LeetCode

fun main(array: Array<String>) {

    val solution: Solution = Solution()
    print(solution.reverse(1534236469))
}

class Solution {
    fun reverse(x: Int) : Int {
        var check : Int = x
        var answer : Int = 0

        while (check != 0) {
            answer = answer * 10 + check % 10
            check /= 10
        }

        return answer
    }
}