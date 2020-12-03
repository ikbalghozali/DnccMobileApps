package Kotlin

fun main() {
    val numlist= 1..20
    val evenList = numlist.filter { it % 2 ==0 }
    evenList.forEach{n -> print("$n ")}
    println()

    fun makeFunMul(num1:Int):(Int)->Int={num2->num1*num2}
    val mul=makeFunMul(3)
    println("3 * 4 = ${mul(4)}")

    fun funMulList(numlist:Array<Int>,fun1:(num1:Int)->Int){
        for (x in numlist) print("${fun1(x)} ")
    }
    val mul2 = {num1:Int->num1*2}
    val numlist2 = arrayOf(1,2,3,4,5)
    funMulList(numlist2,mul2)
}