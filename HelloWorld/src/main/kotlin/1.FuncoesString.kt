fun main() {

    val msg = "Programação Kotlin!"

    // acessando primeira letra
    println(msg[0])

    // comprimento da string
    println(msg.length)

    // verificar se começa ou termina com determinado texto (retorna boleano)
    println(msg.startsWith("Progra"))
    println(msg.endsWith("Progra"))

    // começar do index especificado e vai até o final
    println(msg.substring(4))

    // começar do index especificado e vai até onde definir
    println(msg.substring(4, 6))

    // substituindo a letra "o" por "0"
    println(msg.replace("o", "0"))

    // letra maiúscula e letra minuscula
    println(msg.uppercase())
    println(msg.lowercase())

    // verificar se contem um determinado valor
    println(msg.contains("Kotlin"))
    println(msg.contains("Kotlin00"))

    // verificar se string é vazia
    println(msg.isEmpty())

    // remove todos os espaços
    val semEspacos = msg.replace(" ", "")
    println(semEspacos)  // Saída: "ProgramaçãoKotlin!"

    // cortando espaço em branco no inicio e no fim
    val espaco = " espaços  "
    println(espaco.trim())

}