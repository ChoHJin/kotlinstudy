package com.example.ko

data class Ticket(val companyName : String,
                  val name : String,
                  var date : String,
                  var seatNumber : Int
                  )

class TicketNormal(
    val companyName : String,
    val name : String,
    var date : String,
    var seatNumber : Int)

// toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket(
        "KoreanAir",
        "HyeongJinCho",
        "2022-02-10",
        14
    )
    val ticketB = TicketNormal(
        "KoreanAir",
        "HyeongJinCho",
        "2022-02-10",
        14
    )

    println(ticketA)
    println(ticketB)
}
