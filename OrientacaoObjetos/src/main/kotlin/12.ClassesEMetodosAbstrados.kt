// com "abstract" não precisa de "open"
abstract class Mamifero (var nome: String) {
    abstract fun falar()

    fun acordar(){
        println("Acordei")
    }

    fun dormir(){
        println("Dormi")
    }

}


class Cachorro(nome: String): Mamifero(nome){
    override fun falar(){
        println("Au Au")
    }
}

class Gato(nome: String): Mamifero(nome){
    override fun falar(){
        println("Miau")
    }
}

fun main(){
    val dog = Cachorro("Nome do Cachorro").falar()
    dog
    val cat = Gato("Nome do Cachorro").falar()
    cat
}