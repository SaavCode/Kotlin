package U3_Functions

import java.util.*

fun helloWorld(){
    println("hell world!!!")


}

//date class imported from java
fun getCurrentDate(): Date {

    return Date()
}
//takes two perimeters
fun max(a: Int, b:Int) : Int{

    if (a >= b){return a}//returns maxof two
    else {return b}
}

fun main(args : Array<String> ){

    helloWorld()//call hello world function
    println(getCurrentDate())//print by calling getCurrentDate function
    println(max(17,42))
}