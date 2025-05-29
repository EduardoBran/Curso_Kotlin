import java.util.Locale

fun main(){
    val nome = "Eduardo"

    println("Olá $nome")
    println("\n")

    // Placeholder (reservando lugar)
    val nome2 = "Olá %s".format(nome)
    println(nome2)

    // %s - String
    // %d - Int
    // %f - Float
    // %c - Char
    // %b - Boolean

    val n = 10
    val nome3 = "Olá %s %d".format(nome, n)
    println(nome3)

    println("\n")

    val value = 5
    val salario = 16855.95
    val salario2 = 1589.7859

    println("Valor: %d - Salario: %f".format(value, salario))

    // Alterando a formatação
    println("Valor: %d - Salario: %.2f".format(value, salario2))

    // Alterando "," no numero para "."
    println("Valor: %d - Salario: %.2f".format(Locale.US,value, salario2))


}