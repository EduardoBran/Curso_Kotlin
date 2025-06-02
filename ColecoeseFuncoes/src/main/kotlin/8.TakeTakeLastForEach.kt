// cenário: mapear receita e a receite tem ingrediente

// Retorna Lista de Dados
private fun listaDeDados(): List<Receita>{ // herdando Receita de 6.AnyCountFilterFirstLast
    return listOf(
        // receitas com ingredientes
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de Tomate", 2),
                Ingrediente("Manjericão", 3),
            )
        ),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        ),
        // Receita sem ingrediente
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
    )
}

fun main() {

    val dados = listaDeDados()
    // take -> retorna a quantidade de primeiros elementos da lista (2)
    println(dados.take(2))

    println()
    // takeLast -> retorna a quantidade de ultimos elementos da lista (2)
    println(dados.takeLast(2))

    println()
    // forEach -> percorre o list
    dados.take(2).forEach { println(it.nome) } // retorna o nome dos dois primeiros

    println()
    // retornando todos os resultados
    dados.forEach { receita ->
        // Cabeçalho com nome e calorias
        println("–".repeat(40))
        println("Receita: ${receita.nome}")
        println("Calorias: ${receita.calorias}")

        // Se houver ingredientes, imprime cada um com indentação
        if (receita.ingredientes.isNotEmpty()) {
            println("Ingredientes:")
            receita.ingredientes.forEach { ingr ->
                println("  - ${ingr.nome} (quantidade: ${ingr.quantidade})")
            }
        } else {
            println("Ingredientes: (nenhum)")
        }
    }
    println("–".repeat(40))

}