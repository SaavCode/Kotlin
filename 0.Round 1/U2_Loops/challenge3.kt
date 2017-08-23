package U2_Loops


/**
 * Nestor Saavedra
 *
 * Gets sum of all numbers from 100 to 100,000.
 */
fun main(args: Array<String>) {

    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }

    println(sum) // Result is 5000045050
}