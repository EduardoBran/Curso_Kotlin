/*
Implemente uma função evento(idade: Int, convite: String, codigo: String): String que:
- Recuse (return) e imprima "Negado. Menores não podem." se a idade for menor que 18.
- Recuse (return) e imprima "Negado. Convide inválido" se o tipo de convite não for "comum", "premium" ou "luxo".
- Caso o convite seja "comum" e o código comece com "xt", ou se qualquer código começar com "xl", retorne e imprima "Welcome".
- Em todos os outros casos, recuse e imprima "Negado. Convide inválido".
Escreva também uma função main para testar todos os cenários acima.
 */

const val msgIdade = "Negado. Menores não podem."
const val msgConvite = "Negado. Convide inválido"
const val msgCodigo = "Negado. Código inválido"
const val msgBemVindo = "Welcome"

fun evento (idade: Int, convite: String, codigo: String): String {
    val lista = listOf<String>("comum", "premium", "luxo")
    if (idade < 18) {
        println(msgIdade)
        return msgIdade
    }
    if (convite !in lista) {
        println(msgConvite)
        return msgConvite
    }

    // nova condição de código
    return if (convite == "comum" && codigo.startsWith("xt")) {
        println(msgBemVindo)
        msgBemVindo
    } else if (codigo.startsWith("xl")) {
        println(msgBemVindo)
        msgBemVindo
    } else {
        println(msgCodigo)
        msgCodigo
    }
}

//fun main(){
//    evento(17, "comum", "xt1234")  // Negado. Menores não podem.
//    evento(20, "vip", "xl0000")    // Negado. Convite inválido
//    evento(20, "comum", "xt9999")  // Welcome
//    evento(20, "premium", "xlABCD")// Welcome
//    evento(20, "luxo", "xx0000")   // Negado. Código inválido
//}