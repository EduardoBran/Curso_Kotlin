import kotlinx.coroutines.runBlocking

fun quadrado(n: Int): Int {
    return if (n < 10) {
        n * n
    } else {
        0
    }
}

fun cubo(n: Int): Int {
    return if (n < 10) {
        n * n * n
    } else {
        0
    }
}

// códigos iguais nas funções quadrado e cubo com exceção do cálculo
// ()_ -> Int  -  exemplo de funcao que nao recebe parametro e retorna um inteiro

fun calculo(n: Int, funcao: (Int) -> Int): Int{
    return if (n < 10){
        funcao(n)
    } else{
        0
    }
}

fun calculo2(n: Int, funcao: (Int, Int) -> Int): Int{
    return if (n < 10){
        funcao(n, n)
    } else{
        0
    }
}


fun main() {

    // chamando função de High Order passando os valores explicitamente
    val quadrado = calculo(8, {valor -> valor * valor})         // quadrado
    val cubo = calculo(8) {valor -> valor * valor * valor}               // cubo na forma de lambda

    println(quadrado)
    println(cubo)
    println()

    // chamando função de High Order passando os valores como funcao
    val quadrado2 = calculo(4, ::quadrado)
    println(quadrado2)
    println()

    val funcaoCalculo2 = calculo2(2) {valorN, valorN2 -> valorN * valorN * valorN2}
    println(funcaoCalculo2)


    runBlocking { println("abc") }         // também é uma função High Order

    listOf(1, 2, 3, 4).filter { it == 1 }  // também é uma função High Order
}

// High order - funções que tem capacidade de receber ou retornar uma função como parâmetro