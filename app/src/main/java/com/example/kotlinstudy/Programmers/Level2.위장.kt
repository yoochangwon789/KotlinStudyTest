package com.example.kotlinstudy.Programmers

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>) {

    var testArray: Array<Array<String>> =
            arrayOf(arrayOf("yellowhat", "headgear"), arrayOf("bluesunglasses", "eyewear"),
                    arrayOf("green_turban", "headgear"))

    val camouflage = Camouflage()
    print(camouflage.solution(testArray))

}

class Camouflage() {
    @RequiresApi(Build.VERSION_CODES.N)
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val map : HashMap<String,Int> = HashMap<String, Int>()
        for (i in clothes.indices) {
            clothes[i][1].let {
                clothType ->
                if (map.getOrDefault(clothType, 0) != 0) {
                    map[clothType] = map[clothType]!! + 1
                } else {
                    map[clothType] = 1
                }
            }
        }
        for (key in map.keys) {
            answer *= map[key]!! + 1
        }
        answer -= 1
        return answer
    }
}