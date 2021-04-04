package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {
    var a = 1 + 1
    var b = 10 - 1
    var c = 1 * 1
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    a += 20
    b -= 10
    c *= 3
    d /= 4
    e %= 2

    println()
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    a++;
    b++;
    println()
    println(a)
    println(b)

    var g = a > b
    var h = a == b
    var i = !h

    println()
    println(g)
    println(h)
    println(i)

    var j = h && i
    var k = h || i

    println()
    println(j)
    println(k)
}