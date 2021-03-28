package com.example.kotlinstudy.Kotlin

var a =  1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "Jhon"

// $ 는 변수 연결
var f = "My name is $e Nice to meet yot"

// null

// var abc : Int = null
// 위에 같이 선언하면 null 을 가질 수 없는 형태이고 ? <- 을 붙여주면 null 을 가질 수 있는 타입선언 이다
var abc1 : Int? = null
var abc2 : Double? = null

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
}