package U3_Functions

fun main (args:Array<String>){


    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
}

fun reverse(list: List<Int>) : List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..list.size - 1) {
        result.add(list.size - 1)

    }
    return result
}

    //from top to bottom for(i in list.size - 1 downTo 0)
