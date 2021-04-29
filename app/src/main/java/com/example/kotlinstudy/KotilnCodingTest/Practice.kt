package com.example.kotlinstudy.KotilnCodingTest


fun main(array: Array<String>) {

    val superMonster = SuperMonster(100, 8)
    val monster: Character = Character(100, 8)

    val superHunter = SuperHunter(200, 10)
    val hunter: Character = Character(200, 10)

    superMonster.superAttack(hunter)
}

open class Character(var hp: Int, val power: Int) {

    open fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage

        if (hp > 0) println("${javaClass.simpleName}의 체력은 $hp 입니다.")
        else println("사망했습니다.")
    }
}

class SuperMonster(hp: Int, power: Int): Character(hp, power) {

    fun superAttack(character: Character) {
        super.attack(character, power + 2)
    }
}

class SuperHunter(hp: Int, power: Int): Character(hp, power) {

    override fun defense(damage: Int) {
        val superDefense = 1
        super.defense(damage - superDefense)
    }
}

