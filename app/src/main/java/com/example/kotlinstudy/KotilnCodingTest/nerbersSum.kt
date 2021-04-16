package com.example.kotlinstudy.KotilnCodingTest

fun main(array: Array<String>) {

    var numbers= mutableListOf<Int>(5,0,2,7)

    println(solutionSum(numbers))
}

fun solutionSum(numbers: MutableList<Int>): MutableList<Int> {
    var answer = mutableListOf<Int>()
    var disAnswer = mutableListOf<Int>()

    var top: Int = 1

    for (i in 0 until numbers.size) {
        for (j in top until numbers.size) {
            answer.add(numbers[i] + numbers[j])
        }
        top++
    }

    disAnswer = answer.distinct() as MutableList<Int>
    disAnswer.sort()

    return disAnswer
}