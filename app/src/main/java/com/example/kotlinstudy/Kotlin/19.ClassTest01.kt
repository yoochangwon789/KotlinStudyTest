package com.example.kotlinstudy.Kotlin

import android.accounts.Account

fun main(array: Array<String>) {

    val calculator: Calculator = Calculator(10, 20)

    println("두개의 숫자를 더한 결과 : ${calculator.sum()}")
    println("두개의 숫자를 뺀 결과 : ${calculator.minus()}")
    println("두개의 숫자를 곱한 결과 : ${calculator.multiplication()}")
    println("두개의 숫자를 나눈 결과 : ${calculator.division()}")
    println("두개의 숫자를 나눈 나머지 결과 : ${calculator.remainder()}")

    println()

    val accountTest: AccountTest = AccountTest("유창원", "961001", 1000000)

    accountTest.remainingBalance()
    accountTest.withdraw(100000)
    accountTest.withdraw(200000)
    accountTest.deposit(300000)
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

class AccountTest(var name: String, var birthday: String, var firstMoney: Int) {

    fun remainingBalance() {
        println("$name 님의 남은 잔고 : ${this.firstMoney}")
        println()
    }

    fun withdraw(money: Int) {
        println("출금 : $money")
        this.firstMoney = firstMoney - money
        println("$name 님의 남은 잔고 : $firstMoney")
    }

    fun deposit(money: Int) {
        println("예금 : $money")
        this.firstMoney = this.firstMoney + money
        println("$name 님의 남은 잔고 : ${firstMoney + money}")
    }

}