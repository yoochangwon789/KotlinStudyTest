package com.example.kotlinstudy.Kotlin

// 18.Class

// OOP -> Object Oriented Programing (객체 지향 프로그래밍)
// 객체란 뭘까?
// 이름이 있는 모든 것

// 절차지향 프로그래밍
// 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍
// 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// 선수, 심판, 경기장, 관중 -> 축구게임
// 프레임 워크가 제공하지 않는것을 만들 때 객체를 만들어 사용한다

// 객체를 만드는 방법
// 설명서가 있어야 한다

fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    // Car 라는 객체를 bigCar 라는 변수에 대입이 가능
    // 우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar = Car("v8 engine", "big")

    // 명시적으로 대입
    val bigCar1: Car = Car("v8 engine", "big")

    var superCar: SuperCar = SuperCar("good engine", "big", "white")

    // 인스턴스가 가지고있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    // 인스턴스 멤버변수의 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("simple engine2", "short body2")
    println(runableCar2.engine)
    println(runableCar2.body)

    println()

    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)

}

// 클래스(설명서) 만드는 방법 1
// SuperCar 클래스의 축약 방법 클래스의 매개변수만 넣어도 생성자를 만든것과 같음
class Car (var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법 2
class SuperCar {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 3 -> 1번 방법의 확장 생성자 오버로딩
class Car1(var engine: String, var body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 4 -> 2번 방법의 확장 생성자 오버로딩
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

   constructor(engine: String, body: String) {
       this.engine = engine
       this.body = body
   }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destication: String) {
        println("$destication 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine: String = ""
    var body: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // init 을 사용하면 객체가 인스턴스화 될 때 init 부분이 <가장 먼저> 출력 된다
    init {
        // 초기셋팅을 할 때 유용하다
        println("RunableCar2가 만들어 졌습니다.")
    }

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destication: String) {
        println("$destication 으로 목적지가 설정되었습니다.")
    }
}

// 오버로딩
class TestClass() {

    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")

    }
}