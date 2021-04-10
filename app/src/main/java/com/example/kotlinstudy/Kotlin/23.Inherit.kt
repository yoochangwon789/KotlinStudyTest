package com.example.kotlinstudy.Kotlin

// 두번까지는 봐준다
// 두번 이상이 넘어가면 리팩토링 해라

// 23. 상속
// 부모로부터 설명서를 물려받는다!

fun main(args: Array<String>) {

    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()
}

// class 앞의 기본값이 private 로 정의 되어 있는데 상속을 시키려면 앞에 open 키워드를 입력해야함
open class Car100() {

    open fun drive(): String {
        return "달린다"
    }

    open fun stop() {

    }
}

class SuperCar100(): Car100() {

    override fun drive(): String {
        val run12 = super.drive()
        return "빨리 $run12"
    }

    override fun stop() {

    }
}

class Bus100(): Car100() {

}