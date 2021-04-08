package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    val calculator: Calculator = Calculator(10, 20)
    println("두개의 숫자를 더한 결과 : ${calculator.sum()}")
    println("두개의 숫자를 뺀 결과 : ${calculator.minus()}")
    println("두개의 숫자를 곱한 결과 : ${calculator.multiplication()}")
    println("두개의 숫자를 나눈 결과 : ${calculator.division()}")
    println("두개의 숫자를 나눈 나머지 결과 : ${calculator.remainder()}")
}

class Calculator(var number1: Int, var number2: Int) {

    var result: Int = 0

    fun sum(): Int {
        result = number1 + number2
        return result
    }

    fun minus(): Int {
        result = number1 - number2
        return result
    }

    fun multiplication(): Int {
        result = number1 * number2
        return result
    }

    fun division(): Int {
        result = number1 / number2
        return result
    }

    fun remainder(): Int {
        result = number1 % number2
        return result
    }
}