package U1_COLLECTIONS

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array <String>){

    val array = arrayOf("one","two","three")

    val mixed = arrayOf("mac","windows","linux", 5)
    val numbers = intArrayOf(1,2,3,4,5)
    val arrayList = arrayListOf("nestor","chris","nathan")
    arrayList.add("kratos")//add to arrayList

    println(mixed[3])
    mixed[2] = 3.4
    println(mixed[2])

    val nums = arrayOf("FOUR","Five")
    val allNums =  array + nums

    val empty: Boolean = numbers.isEmpty()
    if(array.contains("one")) {
        println("true")
    }
    else{
        println("false")
    }


    val removed = arrayList.remove("kratos")
    println(removed)

    //other.add, .subList//makes another list


    //nums.size gets the length
}