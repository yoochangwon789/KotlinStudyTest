package com.example.kotlinstudy.Kotlin

// 21. 접근 제어자

fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")
    testAccess.test()
    val reward: Reward = Reward()
}

class Reward() {
    private var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun changName(newName: String) {
        this.name = newName
    }

    fun test() {
        println("test")
    }
}