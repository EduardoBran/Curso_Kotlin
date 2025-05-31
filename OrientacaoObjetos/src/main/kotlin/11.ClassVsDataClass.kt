// Neste exemplo temos Pessoa e usamos apenas o construtor, sem toString ou equals automáticos

class PessoaAulaClassVsDataClass(
    val nome: String,
    val idade: Int
) {
    fun apresentar() {
        println("Olá! Meu nome é $nome e tenho $idade anos.")
    }
}

// Com data class, já temos toString, equals, hashCode, copy e desestruturação

data class PessoaData(
    val nome: String,
    val idade: Int
)

fun main() {
    val p1 = PessoaAulaClassVsDataClass("Alice", 30)
    val p2 = PessoaAulaClassVsDataClass("Alice", 30)
    println(p1)    // saída: Pessoa@7d4991ad (toString padrão de Any)
    println(p1 == p2)  // false: compara referência, não conteúdo

    p1.apresentar()    // Olá! Meu nome é Alice e tenho 30 anos.
    println()

    //dataclass
    val pd1 = PessoaData("Alice", 30)
    val pd2 = PessoaData("Alice", 30)

    // toString gerado automaticamente
    println(pd1)    // saída: PessoaData(nome=Alice, idade=30)

    // equals comparando conteúdo
    println(pd1 == pd2)  // true

    // Uso de copy
    val pd3 = pd1.copy(idade = 31)
    println(pd3)    // PessoaData(nome=Alice, idade=31)

    // Desestruturação automática
    val (nome, idade) = pd3
    println("Nome: $nome, Idade: $idade") // Nome: Alice, Idade: 31
}

// A data class é ideal sempre que a sua classe for usada apenas para armazenar dados
// (sem lógica de negócio intensa).

// A data classe é usada para consumir uma API REST que retorna um JSON

// Ela dá suporte automático a funcionalidades cruciais: equals, hashCode, toString, copy e desestruturação.

// Use classes comuns quando precisar de mais controle sobre como os métodos são gerados ou quando
// houver lógica interna significativa.