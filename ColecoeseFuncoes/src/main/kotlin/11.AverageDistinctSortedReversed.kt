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

fun main(){
    val dados = listaDeDados()
    val dados2 = listOf(2, 4, 4, 8, 2, 3, 15, 7)

    // average - média de calorias
    val mediaDados2 = dados2.average()
    println(mediaDados2)

    // average de calorias (primeiro tem que mapear
    val mediaDeCalorias = dados.map { it.calorias }.average()
    println(mediaDeCalorias)

    println()
    // Distinct - não repetiria o mesmo ingrediente
    println(dados.distinct())

    println()
    // Sorted
    println(dados2.sorted())            // - ordena do maior para o maior
    println(dados2.sortedDescending())  // - ordena do menor para o maior
    // Reversed - Inverte a lista
    println(dados2.reversed())

    println()
    // Da maior calor para a menor caloria
    val maiorCaloriaParaMenorCaloria = dados.map { it.calorias }.sorted()
    println(maiorCaloriaParaMenorCaloria)

    println()
    // filtrando lista que começa com a letra P e ordendando em ordem alfabética
    val nomesLetraPOrdenada = dados.filter { it.nome.startsWith("P") }
        .map { it.nome }
        .sorted()
    println(nomesLetraPOrdenada)

    println()
    val nomesLetraPOrdenada2 = dados
        .filter { it.nome.startsWith("P") }
        .sortedBy { it.nome }
        .map { it.nome }

    for (nome in nomesLetraPOrdenada2){
        println(nome.uppercase())
    }

}