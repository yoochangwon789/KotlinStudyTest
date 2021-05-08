package com.example.kotlinstudy.KotilnCodingTest

fun main(array: Array<String>) {

    val a: String = "one11two44threesix"

    print(solution(a))
}

fun solution(numberString: String): Int {
    var answer: Int = 0

    var result0 = numberString.replace("zero", "0")
    var result1 = result0.replace("one", "1")
    var result2 = result1.replace("two", "2")
    var result3 = result2.replace("three", "3")
    var result4 = result3.replace("four", "4")
    var result5 = result4.replace("five", "5")
    var result6 = result5.replace("six", "6")
    var result7 = result6.replace("seven", "7")
    var result8 = result7.replace("eight", "8")
    var result9 = result8.replace("nine", "9")

    answer = result9.toInt()

    return answer
}

