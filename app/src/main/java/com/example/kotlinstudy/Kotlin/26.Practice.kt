package com.example.kotlinstudy.Kotlin

// 28. 인터페이스
// 인터페이스도 구현이 있는 함수를 만들수 있다
// 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 구현 할 필요가 없다
// 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반드시 구현해야 한다

fun main(array: Array<String>) {

    val student = Student__()
    student.sleep()
}

interface PersonInterface_ {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    // 반드시 구현을 해줘야 한다 키워드 -> abstract
    abstract fun study()
}

class Student__ : PersonInterface_ {
    override fun study() {
    }
}

class Teacher__ : PersonInterface_ {
    override fun study() {
    }
}