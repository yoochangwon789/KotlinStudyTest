package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    val arrayTest: IntArray = intArrayOf(1,2,7,6,4)

    val smallDecimal = SmallDecimal()

    println(smallDecimal.solution(arrayTest))

}

class SmallDecimal() {
    fun solution(nums: IntArray): Int {
        var answer: Int = 0
        var resultBoolean: Boolean = true

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (h in j + 1 until nums.size) {
                    var num = nums[i] + nums[j] + nums[h]

                    if (resultBoolean == sosu(num)) answer++
                }
            }
        }

        return answer
    }

    fun sosu(num: Int): Boolean {
        var sosuBoolean: Boolean = true

        if (num < 2) {
            sosuBoolean = false
            return sosuBoolean
        }

        if (num == 2) return sosuBoolean

        if (num > 2) {
            for (i in 2 until num) {
                if (num % i == 0) {
                    sosuBoolean = false
                    break
                }
            }
        }

        return sosuBoolean
    }
}