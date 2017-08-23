package two

fun main(args : Array<String>){


    val x = 10
    when(x) {

        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "hey".length -> println("x is the length")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("")
        !in 1..9 -> println("not in between")
    }
}