package U2_Loops

fun main(args: Array<String>){
//breaks
    for (c in "python"){
        if(c == 'o'){

            break
        }
        print(c)//pyth

    }

    //jumps

    var list = listOf("one","two","three")
    for (str in list){
        if(!str.contains('o')){
            continue

            break
        }
    println(str)
    }


}
