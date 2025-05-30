class Animal {

    // controle de fluxo para variável nome com Get and Set
    var nome: String? = null

        get() {
            return field // field se refere a variável nome
        }

        set(value) {
            field = value
        }

    private var nome2: String? = null

        get() {
            return field // field se refere a variável nome
        }

        set(value) {
            field = value
        }

    fun acessandoNome2(){
        println(nome2)
    }

}

fun main(){
    Animal().nome
    Animal().acessandoNome2()
}