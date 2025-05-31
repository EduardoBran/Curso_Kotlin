// Define uma interface que declara apenas o contrato para calcular bônus.
// Qualquer classe (anônima ou nomeada) que implemente essa interface
// deverá fornecer a sua própria versão de calculaBonus().
interface FuncionarioAnonimo {
    fun calculaBonus(): Float
}

// Função que recebe um objeto que implementa FuncionarioAnonimo.
// Note que aqui simplesmente imprimimos a referência ao objeto.
// Em uma situação real, normalmente chamaríamos funcionarioAnonimo.calculaBonus()
fun imprimeValorBonus(funcionarioAnonimo: FuncionarioAnonimo) {
    println(funcionarioAnonimo)  // imprime algo como "FuncionarioAnonimo$1@6d06d69c"
    // (se quiséssemos o valor de bônus, faríamos: println(funcionarioAnonimo.calculaBonus()))
}

fun main() {
    // Criamos um objeto **anônimo** que implementa FuncionarioAnonimo “no lugar”.
    // Não estamos definindo uma nova classe nomeada como “class MeuFuncionario : FuncionarioAnonimo { ... }”.
    // Em vez disso, usamos uma expressão de objeto (object expression) para fornecer
    // uma implementação única e imediata:
    imprimeValorBonus(object : FuncionarioAnonimo {
        // Aqui implementamos o único mét0do da interface, calculaBonus().
        // Esse bloco define a lógica do cálculo de bônus para este objeto anônimo.
        override fun calculaBonus(): Float {
            return 0F
        }
    })
    // Depois desta linha, esse objeto anônimo não tem nome e só existe como argumento
    // para imprimeValorBonus(). Não podemos reutilizá-lo em outra chamada, pois não temos
    // um identificador de variável apontando para ele.
}
