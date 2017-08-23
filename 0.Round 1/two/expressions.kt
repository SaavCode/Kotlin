package two

fun main(args: Array<String>)  {

    val mode: Int = 2

    val result = when(mode){
    //switching execution behavior based on what mode it is in

        1 -> "the mode is lazy"
        2 -> {
            "the mode is 2" //when mode is 2 this runs
            println("busy") //thisis returned
        }
        else -> "notknown" //accepts other
    }

   val x =  if(true){   //store if in x
       println("mode is less than 2") //...
       17
    }
    else{
       42
   }

    println(x)
}
