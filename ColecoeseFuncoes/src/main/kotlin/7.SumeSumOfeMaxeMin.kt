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

fun main(){

    val dados = listaDeDados()
    val dados2 = listOf(2, 4, 6)

    // sum e min -> só funciona em coleção numérica
    println(dados2.sum())

    println()
    // para dados usar sumOf -> somar qual atributo quer executar a soma
    println(dados.sumOf { it.calorias }) // imprimiu a soma de calorias

    println()
    // soma das 3 calorias > 500
    println(dados.filter { it.calorias > 500 }.sumOf { it.calorias })


    println()
    // Max -> precisa de coleção numérica (retorna valor máximo)
    // Min -> precisa de coleção numérica (retorna valor mínimo
    println(dados2.maxOrNull())
    println(dados2.minOrNull())

    println()
    // para dados usar maxOf ou minOf
    println(dados.maxOf { it.calorias }) // retorna somente o valor numérico da maior caloria
    println(dados.minOf { it.calorias }) // retorna somente o valor numérico menor caloria

    println()
    // maxByOrNull e minByOrNull
    println(dados.maxByOrNull { it.calorias }) // retorna a receita com o valor numérico da maior caloria
    println(dados.maxByOrNull { it.calorias }?.nome) // retorna o nome da receita com o valor numérico da maior caloria
    println(dados.minByOrNull { it.calorias }) // retorna a receita com o valor numérico menor caloria
    println(dados.minByOrNull { it.calorias }?.nome) // retorna o nome da receita com o valor numérico menor caloria

}