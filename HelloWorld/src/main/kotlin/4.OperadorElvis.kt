fun main() {

    val str: String? = null

    // Operador Elvis
    // Parte1 ?: Parte 2

    if (str == null){
        println("Nulo")
    } else{
        print(str)
    }

    // Usando operador Elvis
    println(str ?: "Nulo com operador elvis")

}