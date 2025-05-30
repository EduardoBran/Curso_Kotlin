// entre parentes são os atributos da Classe e anoNascimento tem valor padrão de 0 ( se nao informar, é zero)
class Pessoa(var nome: String, val anoNascimento: Int = 0) {

    var abc: String = "bla bla"

    fun acordar() {
        //
    }

    fun dormir(){
        //
    }
}

// construtor primário é nome e anoNascimento
class PessoaComConstrutor(var nome: String, val anoNascimento: Int) {

    var documento: String? = null

    // criando construtor secundário
    // (precisa chamar o que o construtor primário está impondo)
    // (precisa chamar o construtor primário com 'this')
    // pode adicionar lógica dentro do constructor
    constructor(nome: String, anoNascimento: Int, documento: String): this(nome, anoNascimento){
        if (documento == "")
            throw Exception()
        else{
            this.documento = documento
        }
    }
}

// cenário -> recebe um ano negativo. Como validar? Usando "init"
class PessoaAnoNegativo(var nome: String, val anoNascimento: Int) {

    // executa quando a classe é instanciada
    init {
        if (anoNascimento <= 0) {
            // throw Exception("Ano Nascimento Inválido.")
            println("Ano de Nascimento inválido.")
        } else {
            println("Classe Criada.")
        }
    }

    // pode usar mais de um init
    init {
        // outra lógica de início
    }
}


fun main() {

    // uma classe quando é instanciado gera um objeto -> class - (instanciada) - objeto
    var p = Pessoa("Fulano", 1988)
    var p2 = Pessoa("Fulano")

    // acessando atributo da classe
    p.nome
    p.anoNascimento

    // acessando variável da classe
    p.abc

   // acessando funções da classe
    p.acordar()
    p.dormir()

    // chamando pessoa2 (com construtor)
    val p3 = PessoaComConstrutor("Beltrano", 1988, "2170090040")

    // prints
    println(p.anoNascimento)
    println(p2.anoNascimento)
    println(p3.documento)
    println()


    // chamando PessoaAnoNegativo
    val p4 = PessoaAnoNegativo("Ciclano", -10)
    val p5 = PessoaAnoNegativo("Ciclano", 2014)
}

// this -> instância da classe / objeto