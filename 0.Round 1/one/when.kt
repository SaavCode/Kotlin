package one
fun main(args: Array<String>)  {

 val mode: Int = 2

    when(mode){
        //switching execution behavior based on what mode it is in

        1 -> println("the mode is lazy")
        2 -> {
            println("the mode is 2") //when mode is 2 this runs
            println("busy")
        }
        else -> println("notknown") //accepts other
    }

    if(true){
        //...
    }
}
