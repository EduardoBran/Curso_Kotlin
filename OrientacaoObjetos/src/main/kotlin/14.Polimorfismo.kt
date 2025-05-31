// Exemplo de Polimorfismo em Kotlin

// “FuncionarioPolimorfismo” é uma **classe abstrata** que define o contrato
// (mét0do abstrato) para calcular bônus. Não há implementação aqui, apenas
// a assinatura do mét0do.
abstract class FuncionarioPolimorfismo {
    // Mét0do abstrato: cada subclasse deverá implementar o seu próprio cálculo de bônus.
    abstract fun calculaBonus(): Float
}

// “GerentePolimorfismo” estende “FuncionarioPolimorfismo” e fornece a implementação
// concreta de calculaBonus() para um gerente.
class GerentePolimorfismo : FuncionarioPolimorfismo() {
    override fun calculaBonus(): Float {
        // Um gerente tem um bônus fixo de 5000,0
        return 5000F
    }
}

// “AnalistaPolimorfismo” também estende “FuncionarioPolimorfismo”, mas implementa
// o cálculo de bônus de forma diferente, com valor de 3000,0.
class AnalistaPolimorfismo : FuncionarioPolimorfismo() {
    override fun calculaBonus(): Float {
        // Um analista tem um bônus fixo de 3000,0
        return 3000F
    }
}

// A função “imprimiValorBonus” recebe um objeto do tipo “FuncionarioPolimorfismo”.
// Graças ao polimorfismo, podemos passar tanto um GerentePolimorfismo quanto um
// AnalistaPolimorfismo, e a chamada a calculaBonus() resolverá dinamicamente
// para a implementação correta em tempo de execução.
fun imprimiValorBonus(funcionarioPolimorfismo: FuncionarioPolimorfismo) {
    // Chama calculaBonus() no objeto recebido. O mét0do correto será
    // usado conforme a classe real do objeto (Gerente ou Analista).
    println(funcionarioPolimorfismo.calculaBonus())
}

fun main() {
    // Ao chamar imprimiValorBonus com um GerentePolimorfismo(),
    // o sistema invoca GerentePolimorfismo.calculaBonus() e imprime “5000.0”
    imprimiValorBonus(GerentePolimorfismo())

    // Ao chamar imprimiValorBonus com um AnalistaPolimorfismo(),
    // o sistema invoca AnalistaPolimorfismo.calculaBonus() e imprime “3000.0”
    imprimiValorBonus(AnalistaPolimorfismo())
}
