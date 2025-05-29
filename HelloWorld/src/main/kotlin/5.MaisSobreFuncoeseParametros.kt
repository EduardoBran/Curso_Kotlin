fun endereco(rua: String, cidade: String, estado: String, cep: String = ""){ // chamam a funcao endereco com cep com valor padrão ""
    // logica
}

fun media(n1: Float, n2: Float): Float {
    return (n1 + n2) / 2
}

fun mediaComVariosValores(vararg valores: Float): Float { // um parametro pode aceitar mais de um valor
    var soma = 0F
    for (i in valores) {
        soma += i
    }
    return soma / valores.size // size informa a quantidade de valores
}

fun mediaComVariosValoresComAny(vararg valores: Any) { // um parametro pode aceitar mais de um valor
    var soma = 0F
    for (i in valores) {
        when(i){
            is Int -> println("$i é Int")
            is Float -> println("$i é Float")
            is String -> println("$i é String")
            is Boolean -> println("$i é Booleano")
        }
    }

}

fun main(){

    // cenario 1: precisa chamar a funcao endereco() mas não contém "cep"
    endereco("", "", "")

    // pode informar parametros com ordem diferente deste que nomeie os parametros

    // cenario 2: precisa informar mais parametros na funcao que só recebe dois
    println(mediaComVariosValores(10F, 10F, 20F, 30F))
    println()

    // Any - tipo que dá origens a outros tipos de variáveis
    mediaComVariosValoresComAny(2.5F, 2, "Eduardo", 10, true, "alice", false, "c")
}