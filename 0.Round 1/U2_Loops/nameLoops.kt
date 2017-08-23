package U2_Loops
/**Nestor saavedra
    out
 */
fun main(args: Array<String>) {
//breaks
    outer@ for (i in 1..10) { //gave name of outer to loop
        for (j in 1..10) {

            if (i - j == 5) {
                break@outer// break loop named outer
            }
            print("$i - $j")//pyth

        }


    }
}