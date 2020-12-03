package Kotlin

fun main() {
    val age = 5
    if (age < 5){
        println("Preschool")
    }
    else if (age >= 5 && age <7) println("Kindergarten")
    else if (age >=7 && age <19) println("Grade ${age-6}")
    else println("College")

    when(age){
        0,1,2,3,4 -> println("Preschool")
        5,6 -> println("Kindergarten")
        in 7..18 -> println("Grade ${age-6}")
        else -> println("College")
    }
}