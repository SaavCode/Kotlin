package U4_OOP

//objects have properties
//and capabilities
//objects can have relationships with each  other

class Person {

    val name: String = "Nestor"
    var age: Int = 28


}

fun main(args: Array<String>){

    val person = Person() //creates person with name nestor age 28
    println(person.age)
    println(person.name)
}
