class Produto(val nome: String, val preco: Double)

// funcao de extensão (adicionar comportamento, não modifica a classe) - geralmente fica em outro arquivo
fun Produto.estaCaro(): Boolean{
    return preco > 10 // retorna true
}

// atributo de extensao (não modifica a classe)
val Produto.descricao: String
    get() = "$nome custa R$ ${"%.2f".format(preco)}"

fun main(){
    val produto = Produto("Café", 25.785455)
    println(produto.estaCaro())

    println(produto.descricao)
}