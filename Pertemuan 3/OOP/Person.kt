package OOP

class Person{
    var firstName : String = ""
    var lastName : String = ""
}
class PersonWithConstructor(firstNamep :String, lastNamep:String){
    var firstName:String = firstNamep
    var lastName:String = lastNamep
    init {
        println("Person named $firstName has created")
    }
    constructor(firstNamep: String):this(firstNamep,"empty")
}
open class PersonWithPropConstructor(var firstNamep: String, var  lastNamep: String){
    fun getFullName():String = firstNamep+" "+lastNamep
    fun sayHello(name:String){
        println("Hello $name")
    }
    fun sayHello(firstname:String,lastname:String){
        println("Hello $firstname $lastname")
    }
    open fun getInfo():Unit = println("$firstNamep $lastNamep")
}
class Student(firstNamep: String,lastNamep: String,var id:String):PersonWithPropConstructor(firstNamep,lastNamep){
    override fun getInfo() {
        println("$firstNamep $lastNamep id : $id")
    }
    fun getFullNameWithSuper(){
        println("${super.getFullName()} id : $id")
    }

}

fun main() {
    val person1 : Person = Person()
    person1.firstName = "DNCC"
    person1.lastName = "Semarang"
    println(person1.firstName)
    println(person1.lastName)

    val person2 : PersonWithConstructor = PersonWithConstructor("DNCC", "Semarang")
    println(person2.firstName)
    val person3 : PersonWithConstructor = PersonWithConstructor("DNCC")
    println(person3.firstName)
    println(person3.lastName)

    val person4 : PersonWithPropConstructor= PersonWithPropConstructor("DNCC","Semarang")
    println(person4.firstNamep)
    println(person4.lastNamep)
    println(person4.getFullName())
    person4.sayHello("Apps")
    person4.sayHello("Mobile","Apps")
    person4.getInfo()

    val student1:Student = Student("Suplo", "Wijoyo","A1120001234")
    println(student1.getFullName())
    student1.getInfo()
    student1.getFullNameWithSuper()

}

