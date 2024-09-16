package org.example.com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String
)

fun printName(name: String) {
    println("Name is: $name")
}

fun main() {
    var nameNullable: String? = null
    println(nameNullable?.length?.toLong() ?: 0);

    nameNullable = "Anton"

    nameNullable?.run {
        printName(this)
    }

    println(nameNullable);

    var name: String = "Anton";

    var movie = Movie(null, "123");

    println("Not saved movie: $movie");

    var savedMovie = saveMovie(movie);

    println(savedMovie.id!!);
    println("Saved movie: $savedMovie");
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1);
}
