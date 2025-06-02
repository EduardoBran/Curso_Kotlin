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

    // map -> fazer um mapeamento (tem a capacidade de transformar a coleção em outra coleção e a coleção original não é alterada)
    val nomeDasReceitas = dados.map { it.nome }
    println(nomeDasReceitas) // exiba somente os nomes

    println()
    val nomeECaloriaDasReceitas = dados.map {
        Pair(it.nome, it.calorias)
    }
    println(nomeECaloriaDasReceitas)
}