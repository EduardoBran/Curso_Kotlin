fun main(){
    val computador = ComputadorHeranca2("xpto", 500F, "azul")
    val microfone = MicrofoneHeranca2("xpto", 500F)

    abc() // da para chamar 4 tipos da mesma funcao (sobrecarga)

}

// Classes com Herança
class ComputadorHeranca2(marca: String, preco: Float, var cor: String) : Eletronico2(marca, preco){

    // sobrescrita override
    override fun ligar(){
        super.ligar() // "super" chama o ligar() de Eletronico2
        println("Carregar o sistema operacional")
    }


    fun instalarSoftware() {
        super.ligar()
        println("Instalando...")
        println("Instalado.")
        super.desligar()
    }
}
class MicrofoneHeranca2(marca: String, preco: Float) : Eletronico2(marca, preco){
    fun gravar() {

    }
}

// 'open' diz que classe é Herdável
open class Eletronico2(var marca: String, var preco: Float) {

    private var correnteEletrica = false

    // 'open' para avisar que será sobrescrito
    open fun ligar () {
        correnteEletrica = true
    }
    fun desligar () {
        correnteEletrica = false
    }
}

// sobrecarga - funcao com mesmo nome com diferentes tipos e parametros

fun abc() {}
fun abc(str: String){}
fun abc(n: Int){}
fun abc(id: Int, n: Int){}
