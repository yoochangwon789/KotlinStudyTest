package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    val account: Account = Account("홍길동", "951001", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()

    val account2: Account = Account("홍길동", "951001", -2000)
    println(account2.balance)

    val account3: Account2 = Account2("홍길동", "951001")
    val account4: Account2 = Account2("홍길동", "951001", 4000)
    println(account3.balance)
    println(account4.balance)
}

class Account {

    val name: String
    val birthday: String
    var balance: Int

    constructor(name: String, birthday: String, balance: Int) {
        this.name = name
        this.birthday = birthday
        if (balance >= 0) this.balance = balance
        else this.balance = 0
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        return if (balance >= amount) {
            balance -= amount
            true
        } else {
            false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birthday: String, var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        return if (balance >= amount) {
            balance -= amount
            true
        } else {
            false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int) {

    // initialBalance 의 접근을 하려면 밑에 코드처럼 변수를 선언해 값의 조건을 넣어주거나 명시를 해줘야 한다
    // 위의 balance 의 음수 값 체크 코드랑 동일하다고 생각하면 된다
    val balance: Int = if (initialBalance >= 0) initialBalance else 0

    // 생성자를 만들 때 자료형을 val, var 을 명시해 주지 않으면 그 클래스 내부에서 함수의 접근이 불가능 하다
    fun checkBalance(): Int {
        return balance
    }
}