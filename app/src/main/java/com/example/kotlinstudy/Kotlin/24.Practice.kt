package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    val openNight: OpenNight = OpenNight(8, 3)
    val openMonster: OpenMonster = OpenMonster(5, 8)

    openNight.openAttack(openMonster)

    println()

    openMonster.openAttack(openNight)

    println()
}

open class OpenNight(var hp: Int, var power: Int) {

     open fun openAttack(openMonster: OpenMonster) {
        println("전사의 공격력은 $power 입니다")
        openMonster.openDefense(power)
    }

    open fun openDefense(monsterDamage: Int) {
        hp -= monsterDamage

        if (hp > 3) {
            openHeal()
            println("몬스터의 $monsterDamage 의 공격을 받았습니다.")
            println("전사의 체력은 3이 회복되었고 남은 hp : $hp")
        } else {
            println("체력이 없는 전사는 죽었습니다.")
        }
    }

    open fun openHeal() {
        hp += 3
    }
}

open class OpenMonster(var hp: Int, var power: Int) {

    open fun openAttack(openNight: OpenNight) {
        println("몬스터는 $power 공격을 했습니다.")
        openNight.openDefense(power)
    }

    open fun openDefense(nightDamage: Int) {
        hp -= nightDamage

        if (hp > 0) println("몬스터의 남은 체력은 $hp 입니다")
        else println("몬스터는 죽었습니다.")
    }
}