package U4_OOP

//objects have properties
//and capabilities
//objects can have relationships with each  other

//methods add functionality



class Person2 {

    val name: String = "Nestor"
    var age: Int = 28


    //method, function inside a class

    fun speak() {
        println("Hello!")
    }
    //one line method
    fun getYearOfBirth() = 2016 - age

}



fun main(args: Array<String>){

    val person = Person2() //creates person with name nestor age 28
    println(person.getYearOfBirth())//print method output
    person.speak()
    println(person.age)
    println(person.name)
}
