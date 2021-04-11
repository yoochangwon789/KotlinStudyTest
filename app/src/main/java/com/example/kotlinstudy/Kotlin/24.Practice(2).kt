package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>) {

    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)

    monster.attack(night, 10)
    monster.bite(night)
}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다

open class Charator(var hp: Int, val power: Int) {

    open fun attack(charator: Charator, power: Int = this.power) {
        charator.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage

        // 클래스의 이름 불러오는 javaClass 를 활용해 그 클래스의 이름을 가져온다
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.")
        else println("사망했습니다")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되서 인스턴스화 되어야 한다
// 자식의 멤버변수들은 val, var 을 붙일 수 없다
class SuperMonster(hp: Int, power: Int) : Charator(hp, power) {

    fun bite(charator: Charator) {
        super.attack(charator, power + 2)
    }
}

class SuperNight(hp: Int, power: Int) : Charator(hp, power) {
    val defensePower = 2

    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}