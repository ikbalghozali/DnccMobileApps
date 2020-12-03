package OOP

abstract class Shape(val lenght:Int){
    abstract val coorX:Int
    abstract val coorY:Int
    abstract fun getCoor()
}
class Circle(lenght: Int):Shape(lenght){
    override val coorX: Int = 0
    override val coorY: Int = 0
    override fun getCoor() {
        println("Circle on Coordinate ($coorX,$coorY)")
    }
}
interface iShape{
    val lenght:Int
    val coorX:Int
    val coorY:Int
    fun getInfo() {
        println("Square with lenght : $lenght coordinates ($coorX,$coorY)")
    }
}
interface Color{
    val fillCollor:String
    val borderColor:String
    fun getColorInfo(){
        println("Fill color : $fillCollor border color : $borderColor")
    }
}
class Square(override val lenght: Int, override val coorX: Int, override val coorY: Int,
             override val fillCollor: String, override val borderColor: String
):iShape,Color

fun main() {
    val shape1:Circle = Circle(2)
    println(shape1.lenght)
    shape1.getCoor()
    val square1:Square = Square(2,1,1,"Red","Blue")
    square1.getInfo()
    square1.getColorInfo()
}