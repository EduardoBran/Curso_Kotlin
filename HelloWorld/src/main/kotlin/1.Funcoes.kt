fun helloWorld() {
    println("Hello World")
}

// Unit = função sem retorno
fun chamando_nome(nome:String): Unit{
    println("Olá, $nome")
}

fun media(n1: Int, n2: Int): Int{  // tem que colocar o retorno ": Double"
    val media = (n1 + n2) / 2
    return media

}

fun media2(n1: Int, n2: Int): Int = (n1 + n2) / 2

fun divisao(n1: Int, n2: Float): Float{
    return n1.toFloat() / n2
}

// ou em expressão única
fun divisao2(n1: Int, n2: Float): Float = n1.toFloat() / n2


// 

fun main() {

    helloWorld()
    chamando_nome("Eduardo")
    println(media(2, 4))

    // função em uma única linha
    fun unicalinha(nome: String) = println("Função Única linha $nome")

    unicalinha("testando")
    println(media2(8, 7))
    println(divisao(2, 2.5F))
    println(divisao2(2, 2.5F))

}