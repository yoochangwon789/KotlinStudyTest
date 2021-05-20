package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    var testArray: Array<Array<String>> =
            arrayOf(arrayOf("yellowhat", "headgear"), arrayOf("bluesunglasses", "eyewear"),
                    arrayOf("green_turban", "headgear"))
    var check: Int = testArray.size

    var testOneArray = mutableListOf<String>()
    var testOneArray2 = mutableListOf<String>()

    for (i in testArray.indices) {
        testOneArray.add(testArray[i][1])
    }

    testOneArray2 = testOneArray.sorted() as MutableList<String>
    println(testOneArray2)

    val camouflage = Camouflage()
    println(camouflage.solution(testArray))
}

class Camouflage() {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0

        var checkArray = mutableListOf<String>()
        var checkArray2 = mutableListOf<String>()
        var check: Int = clothes.size

        for (i in clothes.indices) {
            checkArray.add(clothes[i][1])
        }

        checkArray2 = checkArray.sorted() as MutableList<String>

        for (i in checkArray2.indices) {
            for (j in i + 1 until checkArray2.size) {
                if (checkArray2[i] != checkArray2[j]) check++
            }
        }

        answer = check

        return answer
    }
}