fun main(){
    val computador = ComputadorHeranca("xpto", 500F, "azul")
    computador.ligar()

    ComputadorHeranca("dell", 5000F, "azul").instalarSoftware()

    val microfone = MicrofoneHeranca("xpto", 500F)
    microfone.desligar()

}

// mesmas coisas em Computador e Microfone
class Computador(var marca: String, var preco: Float) {
    fun ligar () {}
    fun desligar () {}
}

class Microfone(var marca: String, var preco: Float) {
    fun ligar () {}
    fun desligar () {}
}

// Classes com Herança
class ComputadorHeranca(marca: String, preco: Float, var cor: String) : Eletronico(marca, preco){
    fun instalarSoftware() {
        super.ligar()
        println("Instalando...")
        println("Instalado.")
        super.desligar()
    }
}
class MicrofoneHeranca(marca: String, preco: Float) : Eletronico(marca, preco){
    fun gravar() {

    }
}

// 'open' diz que classe é Herdável
open class Eletronico(var marca: String, var preco: Float) {
    fun ligar () {}
    fun desligar () {}
}
