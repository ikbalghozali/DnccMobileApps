package Kotlin

fun main() {
    fun add(num1:Int,num2:Int):Int = num1+num2
    fun sub(num1:Int = 8,num2:Int = 4):Int = num1-num2
    fun hello(name:String):Unit = println("Hello $name")
    fun retrun2val(num : Int): Pair<Int, Int>{
        return Pair(num-1,num+1)
    }
    fun factorial(x:Int):Int{
        if (x==0) return 1
        else return x*factorial(x-1)
    }
    println("4 + 5 = ${add(4,5)}")
    println("4 + 5 = ${sub(4,5)}")
    println("4 + 5 = ${sub(4)}")
    hello("DNCC")
    val (result1,resul2) = retrun2val(5)
    println("$result1 5 $resul2")
    println("5 Factorial = ${factorial(5)}")

    val mul = {num1:Int,num2:Int ->num1*num2}
    println("3 * 4 = ${mul(3,4)}")


}