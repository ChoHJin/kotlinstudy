package com.example.ko

fun main() {
    hello()

    println(add(3,5))

    hi()

    //3. String Template
    val name  = "hj"
    val lastName  = "cho"
    println("my name is ${name + " " + lastName}.")

    println("is this true ? ${1==0}")

    // 문자 $ 출력시엔 \를 입력하여 문자로 사용
    println("this is 2\$")
}

// 1. 함수

fun hello() : Unit {  //Unit은 void와 같음
    println("hello world!")
}

fun add(a: Int, b: Int) : Int {
    return a + b
}

// 2. val, var
fun hi() {
    val a : Int = 10
    val b : Int = 12

    var c = 0
    var d : String

    c = a + b

    println(c)
}