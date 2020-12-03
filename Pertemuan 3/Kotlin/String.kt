package Kotlin

fun main() {
    val firstName = "DNCC"
    val lastName = "Semarang"
    val fullName = firstName+" "+lastName
    println(fullName)
    println(firstName+" "+lastName)
    println(fullName.length)

    val string1 = "This is String"
    val string2 = "this is String"
    println("Is string1 and string2 equals? ${string1.equals(string2)}")
    println("Compare string1 to string2 ${string1.compareTo(string2)}")
    println("First index string1 : ${string1[0]}")
    println("Second index string1 : ${string1[1]}")

    println("Compare A to B ${'A'.compareTo('B')}")
    println("Compare B to A ${'B'.compareTo('A')}")
    println("Compare A to A ${'A'.compareTo('A')}")

    println("Index between 4 and 10 of string1 : ${string1.subSequence(4,10)}")
    println("String1 contain This ? : ${string1.contains("This")}")
}