package sealed

// sealed significa que está classe está fechada para herança
sealed class ResultadoPacoteSealed {
    fun printar(){
        println("ResultadoPacoteSealed")
    }
}

class SucessoSealed: ResultadoPacoteSealed() {

}

class FalhaSealed: ResultadoPacoteSealed() {

}