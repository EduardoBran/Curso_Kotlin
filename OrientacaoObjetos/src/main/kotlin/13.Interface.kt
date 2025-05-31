/* Interface em Kotlin é um “contrato” que define o que uma classe deve fazer
   (quais funções ela deve implementar), mas não como fazê-lo (a implementação fica a cargo de cada classe).
   Você usa interfaces quando quer garantir que várias classes diferentes sigam o mesmo conjunto de operações,
   sem as forçar a compartilhar um mesmo ancestral concreto. Além disso, uma classe pode implementar várias
   interfaces (herança múltipla de comportamento), mas só pode estender uma única classe base.
*/

// A interface “Selvagem” obriga toda a classe que a implemente
// a ter um mét0do atacar(), mas não dita como deve ser esse ataque.
interface Selvagem {
    fun atacar()
}

// Classe abstrata “MamiferoInterface” define estado (nome) e alguns
// comportamentos concretos (acordar, dormir), mas também tem um mét0do
// abstrato falar() que cada subclasse precisa implementar.
abstract class MamiferoInterface(var nome: String) {
    abstract fun falar()

    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("Dormi")
    }
}

// “CachorroInterface” estende a classe abstrata MamiferoInterface (herda nome,
// acordar(), dormir() e obriga-se a implementar falar()), e ainda implementa
// a interface Selvagem (por isso precisa sobrescrever atacar()).
class CachorroInterface(nome: String) : MamiferoInterface(nome), Selvagem {
    override fun falar() {
        println("Au Au")
    }

    override fun atacar() {
        println("$nome ataca ferozmente!")
    }
}

// “GatoInterface” só estende MamiferoInterface e implementa falar().
// Ele não é “Selvagem”, logo não tem atacar().
class GatoInterface(nome: String) : MamiferoInterface(nome) {
    override fun falar() {
        println("Miau")
    }
}

fun main() {
    val dog = CachorroInterface("Rex")
    dog.acordar()        // Herdado da classe abstrata
    dog.falar()          // “Au Au”
    dog.atacar()         // “Rex ataca ferozmente!”

    val cat = GatoInterface("Mimi")
    cat.acordar()        // Herdado da classe abstrata
    cat.falar()          // “Miau”
    // cat.atacar() daria erro, pois GatoInterface não implementa Selvagem
}

/*
Use interface se quiser apenas definir métodos obrigatórios (contrato) e permitir que classes
diversas implementem independemente.

Use abstract class se houver código e estado comuns (propriedades, construtor, métodos concretos) que várias
subclasses devem aproveitar, mas que nem todas as classes-filhas podem herdar de outra hierarquia.

 */