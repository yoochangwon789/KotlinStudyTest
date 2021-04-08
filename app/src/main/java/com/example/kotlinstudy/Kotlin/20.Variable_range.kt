package com.example.kotlinstudy.Kotlin

// 변수의 접근 범위
// 1. 전역 변수 >> 어디에서나 접근할 수 있는 변수
// 2. 지역 변수 >> 지역에서만 접근할 수 있는 변수

// 전역변수
var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)

    val test = Test("Test")
    test.testFun()
    test.name
    println(number100)
    println(number200)
}

var number200: Int = 2000

// name 은 지역변수
class Test(var name: String) {

    fun testFun() {
        // 함수안에서만 사용되는 지역변수
        var birth: String = "961001"
        name = "홍길동"
        number100 = 100
    }

}