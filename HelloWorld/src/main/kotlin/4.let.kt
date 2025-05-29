fun main() {
    val str: String? = null

    println(str?.lowercase())
    println(str?.length)
    println(str?.contains("abc"))
    println()

    // Usando Let

    str?.let { // só executa se o corpo não for nulo
        //scope function
        println(it.lowercase())
        println(it.length)
        println(it.contains("abc"))
    }
}