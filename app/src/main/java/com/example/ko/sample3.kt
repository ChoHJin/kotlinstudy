package com.example.ko

// 1. lamda
// 람다식은 value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}
val nameAge = {name : String, age : Int ->
    "my name is ${name}, I'm ${age}"
}


class sample3 {

}

fun main() {
    println(square(10))
    println(nameAge("hj", 25))

    val a = "hj said"
    val b = "hs said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("hj", 25))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({ it > 3.22 }))
}


//확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 리턴
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "Perfect"
        else -> "Error"
    }
}

//람다를 표현하는 2가지 방식
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}