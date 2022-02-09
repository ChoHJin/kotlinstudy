package com.example.ko

fun main() {
    nullcheck()
}

fun maxBy(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    }else {
        return b
    }
}
// 3항연산자가 없어 이렇게 사용 가능
fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        in 8..10 -> println("good")
        else -> 3
    }
}

// List 1. List(읽기전용), 2. MutableList(읽기, 쓰기 모두 가능)

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 3.4f)

    array[0] = 3
    var result = list.get(3)

}

fun forandwhile() {
    val students = arrayListOf("tory", "mond","cho")

    for (name in students) {
        println("${name}")
    }

    var sum : Int = 0
    for(i in 1..100) {
        sum += 1
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("index : ${index}")
        index++
    }
}

//7. Nullable / NonNull

fun nullcheck() {
    var name = "hj"
    var nullName : String? = null  // ?로 nullable로 만들 수 있다
    var nameInUpperCase  = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase()

    println(nameInUpperCase)
    println(nullNameInUpperCase)

    // ?: 엘비스 연산자 null이면 ?: 다음 텍스트 출력
    val lastName : String? = null

    val fullName = name + (lastName?: " No lastName")

    println(fullName)

}

// !! : Null이  절대로 아니라고 선언, 하지만 사용하는 것을 지양하고 대신 ?, ?:를 권장함

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()

    val email : String?= "xxx@gmail.com"
    email?.let{
        println("my email is ${email}")
    }

}

