fun main() {

    // Declarando Variáveis
    var teste: String = "Hello World"

    var b: Boolean = true
    var texto: String = "Hello World"
    var c: String = "a"


    println(teste)

    println("\n")
    println("${Double.MIN_VALUE} - ${Double.MAX_VALUE}")
    println("${Float.MIN_VALUE} - ${Float.MAX_VALUE}")
    println("${Long.MIN_VALUE} - ${Long.MAX_VALUE}")
    println("${Int.MIN_VALUE} - ${Int.MAX_VALUE}")
    println("${Short.MIN_VALUE} - ${Short.MAX_VALUE}")
    println("${Byte.MIN_VALUE} - ${Byte.MAX_VALUE}")
    println("\n")

    // val não pode alterar (obrigatorio iniciar valor) | var pode alterar

    // Dar espaço na string

    val linguagem = "Kotlin"
    val carac = "é show!"

    println("$linguagem $carac")

    println("\n")

    val soma = 2 + 2

    println(soma)

    println("\n Incremento")

    // Incremento

    var valor = 2
    valor++
    println(valor)
    println("\n")
    var valor2 = 10

    println(valor2++)
    println(valor2--)
    println(++valor2)
    println(--valor2)



}