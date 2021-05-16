package com.example.kotlinstudy.Programmers

fun main(array: Array<String>) {

    val a = intArrayOf(1,6,10,19,31,45)
    val b = intArrayOf(0,0,0,0,0,0)

    val lotto = Lotto()

    print(lotto.solution(b, a))
}

class Lotto() {
    fun solution(lottos: IntArray, win_nums: IntArray): MutableList<Int> {
        var answer = mutableListOf<Int>()

        var lottosCheck: Int = 0
        var zeroCount: Int = 0
        var win: Int = 0

        var zeroCheckArray = mutableListOf<Int>()

        for (i in lottos.indices)  {
            if (lottos[i] != 0){
                zeroCheckArray.add(lottos[i])
            } else zeroCount++
        }

        if (zeroCheckArray.size > 0) {
            for (i in zeroCheckArray.indices) {
                for (j in win_nums.indices) {
                    if (zeroCheckArray[i] == win_nums[j]) lottosCheck++
                }
            }
        }

        // 최고순위
        if (zeroCount >= 0) {
            win = lottosCheck + zeroCount

            when (win) {
                6 -> answer.add(1)
                5 -> answer.add(2)
                4 -> answer.add(3)
                3 -> answer.add(4)
                2 -> answer.add(5)
                else -> answer.add(6)
            }
        }

        // 최저순위
        when (lottosCheck) {
            6 -> answer.add(1)
            5 -> answer.add(2)
            4 -> answer.add(3)
            3 -> answer.add(4)
            2 -> answer.add(5)
            else -> answer.add(6)
        }

        return answer
    }
}