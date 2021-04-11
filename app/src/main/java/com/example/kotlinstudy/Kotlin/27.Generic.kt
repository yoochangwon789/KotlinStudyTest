package com.example.kotlinstudy.Kotlin

import java.util.*

// 29. Generic(제너릭)

// 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에서
//       컴파일시에 타입을 체크해주는 기능

// 재너릭은 만들기 어렵고 실제로 만들일 거의 없기 때문에 사용하는 방법만 숙지

fun main(args: Array<String>) {

    // 제너릭을 사용하지 않은 경우
    // 형 변환을 해줘야 한다
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString()     // 형 변환 -> 타입을 변환 시킨다


    // 제너릭을 사용하는 경우 -> 타입이 안전 하다
    val list2 = listOf<String>("1", "2", "3")
    val c: String = list2[0]    // String 이라는 것을 보장받는다


    // 강한 타입을 체크 할수 있다
    val list3 = listOf(1, 2, 3, "가", "나", 3.4)
    val list4 = listOf<Int>(1, 2, 3)    // 강한 타입 체크


    // 제너릭을 사용하지 않은 경우
    val list5 = listOf(1, 2, 3, "가")    // -> Any >> 여러가지 타입이 들어왔을 때 정의하는 타입 Any 타입이라 한다.
    // 부모 : Any
    // 자식 : String, Int, Float

    val scan = Scanner(System.`in`)

    print("Enter first number : ")
    val num1: Int = scan.nextInt()

    print("Enter first number : ")
    val num2: Int = scan.nextInt()

    val sum = num1 + num2

    println("result : $sum")
}