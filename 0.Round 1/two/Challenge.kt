package two

import java.util.*

fun main(args : Array <String>){

    val random = Random().nextInt(50)//generate random number from 0 to 49


    when(random){
        in 1..10 -> println("#: $random, in 1 to 10")
        in 11..20 -> println("#:$random, 11 to 20")
        in 21..30 -> println("#: $random, 21 to 30")
        in 31..40 -> println("#: $random, 31 to 40")
        else ->{
            println(" #: $random , above 40")
        }


    }

}