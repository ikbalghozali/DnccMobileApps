package Kotlin

fun main() {
    var array1= arrayOf(1,2,3)
    val array2 = arrayOf(1,2,"String")
    println(array1[1])
    array1[1] = 9
    println(array1[1])
    println("Size of array1 : ${array1.size}")
    println("is array2 contain String ? : ${array2.contains("String")}")

    val array3 = array1.copyOf(3)
    println(array3[2])
    var array4 = array1.copyOfRange(0,2)
    println("First value array4 : ${array4.first()}")
    println("Last value array4 : ${array4.last()}")

    println("9 is on index ${array1.indexOf(9)}")

    var squareArray = Array(9,{x->x*x})
    println(squareArray[3])
}