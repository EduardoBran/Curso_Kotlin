
/*
Ex1) Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica.
     Informar se formar um quadrado (lados iguais)

Ex2) Escreva um programa capaz de ler três números inteiros que representam os lados de uma figura geométrica.
     Informar se formar um retangulo (todos os lados iguais)
 */

fun ex1(n1: Int, n2: Int) {
    if (n1 == n2) {
        println("Isso é um quadrado. São lados iguais.")
    } else {
        println("Não é um quadrado.")
    }
}

fun ex2(n1: Int, n2: Int, n3: Int): String {
    if (n1 == n2 && n2 == n3) {
        return "Isso é um retangulo. São lados iguais."
    }
    return "Não é um triângulo."

}

//Ex3) Escreva um programa para ser usado na portaria de um evento:
//a. Peça a idade. Menores de idade não são permitidos.
//Mensagem "Negado. Menores não podem."
//b. Peça o tipo de convite. Os tipos de convite são 'comum', 'premium' e 'luxo.
//Negar a entrada caso não seja nenhum destes. Mensagem "Negado. Convide inválido"
//c. Caso todos os critérios sejam satisfeitos, exibir "Welcome"

fun evento (idade: Int, convite: String): String {
    val msgIdade = "Negado. Menores não podem."
    val msgConvite = "Negado. Convide inválido"
    val msgBemVindo = "Welcome"
    val lista = listOf<String>("comum", "premium", "luxo")
    if (idade < 18) {
        println(msgIdade)
        return msgIdade
    }
    if (convite !in lista) {
        println(msgConvite)
        return msgConvite
    }

    println("Bem Vindo")
    return msgBemVindo
}

fun evento2 () {
    val msgIdade = "Negado. Menores não podem."
    // lê a idade (Int?) e converte; se for nulo, já sai
    print("Digite a idade: ")
    val idade = readLine()?.toIntOrNull() ?: return
    if (idade < 18) {
        println(msgIdade)
        return
    }
    // lê o convite; se for nulo, considera string vazia
    print("Digite o convite: ")
    val convite = readLine().toString().lowercase()
    val msgConvite = "Negado. Convide inválido"
    val lista = listOf<String>("comum", "premium", "luxo")

    if (convite !in lista) {
        println(msgConvite)
        return
    }

    println("Bem Vindo")
    return
}

fun main(){

    ex1(4,5)
    println(ex2(2,2,3))
    evento(18, "luxo")
    evento2()
}