package com.example.kotlinstudy.KotilnCodingTest

fun main(array: Array<String>) {


}

class kakaoSolution {
    fun solution(new_id: String): String {
        var answer: String = new_id

        answer = step1(answer)
        answer = step2(answer)
        answer = step3(answer)
        answer = step4(answer)
        answer = step5(answer)
        answer = step6(answer)
        answer = step7(answer)

        return answer
    }

    private fun step1(new_id: String): String {
        return new_id.toLowerCase()
    }

    private fun step2(new_id: String): String {
        var sb = StringBuffer()

        new_id.forEach {
            if ((it in 'a'..'z') || (it in '0'..'9') || it == '-' || it == '_' || it == '.') {
                sb.append(it)
            }
        }

        return sb.toString()
    }

    private fun step3(new_id: String): String {
        var result = new_id

        while (result.contains("..")) {
            result = result.replace("..", ".")
        }

        return result
    }

    private fun step4(new_id: String): String {
        var result = new_id

        val indexOfFirst = result.indexOfFirst { it == '.' }
        if (indexOfFirst != -1 && indexOfFirst == 0)
            result = result.replaceFirst(".", "")

        val indexOfLast = result.indexOfLast { it == '.' }
        if (indexOfLast != -1 && indexOfLast == result.length - 1) {
            result = result.substring(0, indexOfLast)
        }

        return result
    }

    private fun step5(new_id: String): String {
        var result = StringBuffer(new_id)

        if (result.isEmpty()) result.append("a")

        return result.toString()
    }

    private fun step6(new_id: String): String {
        var result = new_id

        if (result.length > 15)
            result = result.substring(0, 15)

        val indexOfLast = result.indexOfLast { it == '.' }
        if (indexOfLast != -1 && indexOfLast == result.length - 1)
            result = result.substring(0, indexOfLast)

        return result
    }

    private fun step7(new_id: String): String {
        var result = StringBuffer(new_id)

        while (result.length <= 2) {
            result.append(result.last())
        }

        return result.toString()
    }
}
