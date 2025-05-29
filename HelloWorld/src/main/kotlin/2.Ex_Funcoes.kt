/*
    * Ex1) Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
    * Saída desejada:
    * 2 ano(s) corresponde(m) a:
    * 24 meses
    * 730 dias
    * 17520 horas
    * 1051200 minutos
    * 63072000 segundos
 */
fun qtdAnos(n: Int) {
    val n = n

    val meses = n * 12
    val dias = n * 365
    val horas = (n * 365) / 24
    val min = (n * 365 * 24) * 60
    val seg = (n * 365 * 24 * 60) * 60

    println("$n ano(s) corresponde(m) a:\n")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$min min")
    println("$seg seg")
}

/*
* Ex2) Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres
*/

fun qtdCaracteres(car: String): Int{
    val qtd = car.length
    return qtd
}

fun qtdCaracteres2(car: String): Int = car.length

/*
* Ex3) Escreva uma função capaz de calcular o cubo de um número (cubo = n*n*n)
*/

fun calcCubo(n1: Int, n2: Int, n3: Int) {
    val cubo = n1 * n2 * n3
    println("Valor de cubo: $cubo")
}

fun calcCubo2(n1: Int, n2: Int, n3: Int): Int = n1 * n2 * n3

/*
* Ex4) Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km)
*/

fun calcMilhasEmKm(n1: Int): Double {
    val res = n1 * 1.60934
    return res
}

fun calcMilhasEmkm2(n1: Int): Double = n1 * 1.60934

/*
* Ex5) Escreva uma função capaz de receber Celsius e converter em Fahrenheit ( F = (C * 9/5) + 32 )
*/

fun calcCelsiusF(n1: Double): Double {
    val res = (n1 * 9/5) + 32
    return res
}

fun calcCelsiusF2(n1: Double): Double = (n1 * 9/5) + 32


/*
* Ex6) Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" pox "x"
* a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada
* b. Escrever uma função para ler a String
* c. Escrever uma função para trocar de letras e impressão do valor final
* d. String final deve estar com todas as letras maiúsculas
* */

fun ex6(): String? {

    print("Informe a String: ")
    val str  = readLine()
    val trocada = str
        ?.replace("a", "X")
        ?.replace("A", "X")
        ?.uppercase()

    return trocada
}

/*
* Ex7) Escreva as funções dos exercícios 2, 3, 4 e 5 como funções de única linha
*/


fun main(){
    // Ex1
    println("Ex 1")
    qtdAnos(2)

    // Ex2
    println("\nEx 2")
    val valorEx2 = "Eduardo"
    println("Quantidade de caracteres de $valorEx2: ${qtdCaracteres(valorEx2)}")

    // Ex3
    println("\nEx 3")
    calcCubo(4,4,4)

    // Ex4
    println("\nEx 4")
    val valorKm = 4
    println("Km de valor $valorKm = ${calcMilhasEmKm(valorKm)} milhas.")

    // Ex5
    println("\nEx 5")
    val valorCelsius = 4
    println("Celsius de valor $valorCelsius = " + calcCelsiusF(valorCelsius.toDouble()) + " Fahrenheit.")

    // Ex6
    println("\nEx 6")
    println(ex6())

    // Ex7
    println("\nEx 7")
    println(qtdCaracteres2("Eduardo"))
    println(calcCubo2(4, 4, 4))
    println(calcMilhasEmkm2(valorKm))
    println(calcCelsiusF2(valorCelsius.toDouble()))


}


/*
1. Tipos com ?: “pode faltar”

- "String" significa: “aqui sempre tem uma palavra” — nunca é null.
- "String?" significa: “aqui pode ter uma palavra, ou pode não ter nada (null)”.


val nome: String  = "Ana"   // sempre tem valor
val apelido: String? = null // pode ser null (não tem valor)
⚠️ Se você usar um tipo sem ? e ele acabar sendo null, o programa quebra.

 */

