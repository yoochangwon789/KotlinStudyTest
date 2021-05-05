package com.example.kotlinstudy.InnerClass

fun main(array: Array<String>) {

    // Nested class 중첩 클래스 선언
    val innerClass = OutClass.InnerClass()

    // Inner class 이너 클래스 선언
    val innerClass2 = OutClass2().InnerClass2()
}

// Nested class 정의 -> 중첩 클래스는 OutClass 의 접근이 불가
class OutClass() {

    private val data: Int = 1

    class InnerClass() {

        init {
            // data 접근 불가
            // print(data)
        }
    }
}

// Inner class 정의 -> 이너 클래스는 OutClass 의 접근 가능
class OutClass2() {

    private val data2: Int = 2

    inner class InnerClass2() {

        init {
            // OutClass data2 변수 접근 가능
            println(data2)
        }
    }
}