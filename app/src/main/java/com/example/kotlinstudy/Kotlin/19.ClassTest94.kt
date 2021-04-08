package com.example.kotlinstudy.Kotlin

fun main(array: Array<String>) {

    val tv = TV(listOf<String>("K", "M", "S"))

    tv.channelDown()
    println(tv.checkCurrentChannel())
    //tv.channelDown()
    //println(tv.checkCurrentChannel())
    //tv.channelDown()
    //println(tv.checkCurrentChannel())
    //tv.channelDown()
    //println(tv.checkCurrentChannel())
    //println(tv.currentChannelNumber)
}

class TV(val channels: List<String>) {

    var onOrOff: Boolean = false // True -> On, False -> Off
    // set 함수를 변수 밑에 저렇게 적어주면 할당된 값을 체크할 수 있다
    // 그대신 value 를 변수의 값을 할당 해줘야 값이 어떻게 변하는지 확인할 수 있다
    // 값이 할당 되는 순간 set 함수 호출!! 그래서 set 안에 값을 할당하면 안된다
    // currentChannelNumber = value 를 하게 되면 무한루프가 돌기 때문에 field 를 사용해준다
    // 외냐하면 set 함수는 currentChannelNumber 할당 될 때 루프가 도는데 set 내부에서 저렇게 할당 해주면
    // currentChannelNumber 가 계속 할당이 되면서 무한루프가 발생!! 그래서 field 를 사용한다
    var currentChannelNumber = 0
        set(value) {
            field = value
            // 할당 된 값이 2보다 커지면 0 으로 할당
            if (field > 2) field = 0
            // 할당 된 값이 0보다 작아지면 2로 할당
            if (field < 0) field = 2
        }
        // 값이 호출되면 get 함수가 실행됨
        // field 를 리턴해주고 만약 값을 + 1 이런식으로 더해주면 그 값은 +1 이 된상태로 호출이된다
        get() {
            println("호출되었습니다.")
            return field
        }
    // 값의 할당
    // a = b  -> b 를 a 에 할당한다

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber += 1
    }

    fun channelDown() {
        currentChannelNumber -= 1
    }
}