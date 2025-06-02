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

fun exibirReceitasMaiorCaloriaParaMenorCaloria(receitas: List<Receita>) {
    receitas
        .sortedByDescending { it.calorias }
        .forEach { receita ->
            println("-".repeat(40))
            println("Receita: ${receita.nome}")
            println("Calorias: ${receita.calorias}")

            if (receita.ingredientes.isNotEmpty()){
                println("Ingredientes:")
                receita.ingredientes.forEach { ingredientes ->
                    println("  - ${ingredientes.nome} (quantidade: ${ingredientes.quantidade})")
                }
            } else {
                println("Ingredientes: (nenhum)")
            }
        }
    println("-".repeat(40))
}

fun main(){
    val dados = listaDeDados()
    exibirReceitasMaiorCaloriaParaMenorCaloria(dados)
}