
enum class Direction{
        //use enum for data collection
        NORTH,SOUTH,EAST,WEST//directions
}

fun main(args:Array<String>){

    var userdirect=Direction.SOUTH//set direction to south

    if(userdirect==Direction.NORTH){//check direction
        println("he wen to north")
    }else{
        println(" i donot know where he went")
    }

}
