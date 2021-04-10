package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>) {

    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)

    monster.attack(night)
}

open class Charator(var hp: Int, val power: Int) {

    fun attack(charator: Charator) {
        charator.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage

        if (hp > 0) println("남은 체력 $hp")
        else println("사망했습니다")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되서 인스턴스화 되어야 한다
// 자식의 멤버변수들은 val, var 을 붙일 수 없다
class SuperMonster(hp: Int, power: Int): Charator(hp, power) {

}

class SuperNight(hp: Int, power: Int): Charator(hp, power) {

}