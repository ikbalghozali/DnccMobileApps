package Kotlin

fun main() {
    val range1= 1..7
    for (x in range1) println("range1 : $x")
    for (x in range1.reversed()) println("range1rev : $x")
    val alfabet = "A".."Z"
    println("is 5 on range1 ? ${5 in range1}")
    println("is C on alfabet? ${"C" in alfabet}")
    val range2 = 5.downTo(1)
    val range3 = 6.rangeTo(11)
    val range4 = range1.step(3)
    for (x in range2) println("range2 : $x")
    for (x in range3) println("range3 : $x")
    println("Values of range4")
    range4.forEach{n-> print("$n ")}

}