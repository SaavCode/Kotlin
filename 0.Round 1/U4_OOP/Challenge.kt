package U4_OOP

/**
 *Nestor Saavedra
 * Defines a Movie class from specified properties and methods.
 */
class Movie(val title: String, val director: String, val filmingYear: Int, var rented: Boolean) {

    // You do not necessarily need to return a Boolean.
    fun rent(): Boolean {
        if (!rented) {
            rented = true
            return true
        } else {
            println("Sorry, the movie is rented out.")
            return false;
        }
    }

    // You do not necessarily need to return a Boolean.
    fun returnMovie(): Boolean {
        if (rented
                ) {
            rented = false
            return true
        } else {
            println("The Movie wasnt rented cant return.")
            return false
        }
    }

    fun print() {
        println("Movie [title=$title, author=$director, publicationYear=$filmingYear]")
    }
}

// Let's test our class.
fun main(args: Array<String>) {
    val movie = Movie("Resident Evil", "Spielberg", 2003, false)
    movie.returnMovie()   // Does not work because we did not rent
    movie.rent()       // Let's rent it.
    movie.rent()       // We cannot rent without returning.
    movie.returnMovie()   // Let's return it.
    movie.print()        // print it
}