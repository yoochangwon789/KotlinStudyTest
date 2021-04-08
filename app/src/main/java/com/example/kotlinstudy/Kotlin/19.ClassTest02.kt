package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    val calculator2: Calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multiply(1, 2, 3))
    println(calculator2.divide(10, 2, 3))

    // 반환값이 객체이면 반환값의 객체의 기능을 이어갈 수 있다
    // Chaining(체이닝)
    val calculator3 = Calculator3(3)
    println(calculator3.plus(5).minus(5).initialValue)
}

class Calculator2() {

    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int { // 10, 2, 3 -> 10/2/3
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            // 10 -> 10/10/2/3 을 방지하기 위한 조건 index 의 값이 0이 아닐경우에만 연산이 이루어 진다
            if (index != 0 && value != 0) {
                result = result / value
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}