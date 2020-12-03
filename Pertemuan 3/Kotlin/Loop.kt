package Kotlin

fun main() {
    println("Loop 1 to 10")
    for (x in 1..10) print("$x ")
    println("\nLoop 1 to 10 Even")
    for (x in 1..10) {
        if (x%2==0) print("$x ")
    }
    println("\nLoop 1 to 10 Odd")
    for (x in 1..20) {
        if (x%2==0) continue
        print("$x ")
        if (x == 13) break
    }
    val array1 = arrayOf(1,2,5,12,2)
    println("\nArray 1")
    for (x in array1) print("${x} ")
    println("\nArray 1 with index")
    for ((index,value) in array1.withIndex()){
        print("$index : $value; ")
    }
    println("\nLooping While")
    var i=0
    while (i<10){
        print("$i ")
        i++
    }
    println("\nLooping Do-While")
    i=0
    do {
        print("$i ")
        i++
    }while (i<10)
}