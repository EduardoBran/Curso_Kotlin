// “fun interface” em Kotlin define uma interface funcional, ou seja, uma interface que contém exatamente
//  um mét0do abstrato. Isso permite que usemos expressões lambda para instanciar essa interface sem criar
//  uma classe anônima completa.
fun interface FuncionarioLambda {
    fun calculaBonus(str: String, id: Int): Float
}

// Função que recebe uma instância de FuncionarioLambda e chama o mét0do
// calculaBonus fornecido pela implementação (neste caso, pela lambda).
fun imprimeValorBonusLambda(funcionarioLambda: FuncionarioLambda) {
    // Aqui passamos dois argumentos (“string lambda” e 10) para o mét0do calculaBonus
    // definido pela lambda que será fornecida em main(). O valor de retorno (Float)
    // pode ser impresso ou usado em outro cálculo, mas neste exemplo imprimimos direto.
    println("Retorno do cálculo de bônus: ${funcionarioLambda.calculaBonus("string lambda", 10)}")
}

fun main() {
    // Nesta chamada, em vez de criar um objeto anônimo que implementa FuncionarioLambda,
    // usamos uma expressão lambda diretamente. Como FuncionarioLambda é uma “fun interface”,
    // o compilador sabe que esta lambda corresponde ao único mét0do abstrato “calculaBonus”.

    imprimeValorBonusLambda { str, id ->
        // Dentro da lambda, “str” e “id” são os parâmetros correspondentes a
        // “str: String” e “id: Int” de calculaBonus().
        // Podemos executar qualquer lógica aqui e, no final, retornar um Float.

        println("Parâmetro str recebido: $str")  // Exemplo de uso de “str”
        println("Parâmetro id recebido: $id")    // Exemplo de uso de “id”
        0F // Valor retornado pela lambda; corresponde ao retorno de calculaBonus()
    }
}
