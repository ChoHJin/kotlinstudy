package com.example.ko

// open이 오버라이딩 같은 느낌인듯
open class Human {

    constructor(name : String, age : Int) {
        println("my name is ${name}, ${age} years old")
    }
    init {
        println("New human has been born")
    }

    fun eat() {
        println("eat eat")
    }
}

class Korean : Human() {

}


fun main() {
//    val human = Human("hj")
//
//    val stranger = Human()
//
//    human.eat()
    val seo = Human("hs", 26)

//    println("this human's name is ${stranger.name}")
}