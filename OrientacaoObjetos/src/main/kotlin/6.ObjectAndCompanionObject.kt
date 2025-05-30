class Matematica {
    var id: Int = 10

    val PI = 3.1415

    // só pode ter um por classe e pode ou não ter um nome
    companion object {
        val PI2 = 3.1415

        fun abc() {
            println("Sou a Classe Matemática")
        }

        // só é chamado UMA VEZ
        init {
            println("Fui chamado")
        }
    }


    // object precisa ter um nome e pode ser criado mais de um
    object OBJ1 {
        fun abc() {
            println("Sou a OBJ 1")
        }
        // só é chamado UMA VEZ
        init {
            println("Fui chamado")
        }
    }
    object OBJ2 {
        fun abc() {
            println("Sou a OBJ 2")
        }
    }
}

fun main(){

    Matematica().id   // escopo do objeto
    Matematica().PI   // escopo do objeto
    Matematica.PI2    // escopo da classe
    Matematica.abc()  // escopo da classe com função


    // prints
    println(Matematica.PI2)
    println(Matematica.PI2)
    println(Matematica.PI2)

    Matematica.OBJ1.abc()
    Matematica.OBJ2.abc()
}