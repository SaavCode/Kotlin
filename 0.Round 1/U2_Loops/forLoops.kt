package U2_Loops

fun main(args: Array<String>){

    var sum = 0
    for (i in 1..100){
        sum = sum +1

    }
    println(sum)
    //print all elemnt of list
    val list = listOf("mac","win","lin")
    for (element in list){

        print(element)
    }
//show indexfor elements by looping
    for ((index, value) in list.withIndex()){

        println("element at $index is $value")
    }


    //while loop
    var x = 9
    var i = 1
    while(i <=10){

        println(x)
        x--//decrement x every time lop occurs
    }
}
