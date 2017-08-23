package U1_COLLECTIONS

fun main(args : Array<String>){

    /**
     *  Nestor Saavedra
     *
     * Creates a list of games, loops over it and, if the title contains 'e', prints each char in a line.
     */
    val games = arrayListOf("uncharted", "resident evil", "bioshock")
for (dog in games) {
    if (dog.contains("e")) {
        for(character in dog) {
            println(character)
         }
      }
        println()
    }
}