package com.example.ko

// open이 오버라이딩 같은 느낌인듯
open class Human(val name : String = "Annonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }
    init {
        println("New human has been born")
    }

    fun eat() {
        println("eat eat")
    }

    open fun singAsong() {
        println("lalalalala")
    }
}

class Korean : Human() {
    override fun singAsong(){
        super.singAsong()
        println("lala wawa")
        println("my name is : ${name}")
    }
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