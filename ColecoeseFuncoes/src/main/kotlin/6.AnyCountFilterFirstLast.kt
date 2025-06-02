// cenário: mapear receita e a receite tem ingrediente

// Retorna Lista de Dados
private fun listaDeDados(): List<Receita>{
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

// Classes de Dados
data class Receita (val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

fun main() {

    val dados = listaDeDados()

    // any (qualquer) - verifica se tem algum item na lista (mesmo que if dados >= 1)
    if (dados.any()){

        // imprime toda a lista
        println(dados)

        val receitaComMaisDe500calorias = dados.any { it.calorias > 500 }
        println(receitaComMaisDe500calorias) // retorna true or false para calorias > 500 em Receitas
    }

    println()
    // count - retorna o número de elementos da coleção
    if (dados.any()){
        println(dados.count()) // retorna quantidade de Receitas

        val receitaComMaisDe500calorias = dados.count { it.calorias > 500 }
        println(receitaComMaisDe500calorias) // retorna quantidade de receitas > 500 em Receitas
    }

    println()
    // filter (espera receber uma função)
    if (dados.any()){
        // filtrando e exibindo receita com mais de 500 calorias
        val receitaComMaisDe500calorias = dados.filter { it.calorias > 500 }
        println(receitaComMaisDe500calorias) // Retorna o map com chaves e valor das calorias > 500
        println(receitaComMaisDe500calorias.count())
    }

    println()
    // first e last
    if (dados.any()){
        println(dados.first())
        println(dados.firstOrNull()) // retorna primeira e se estiver vazio, retorna nulo
        println(dados.last())
        println(dados.lastOrNull()) // retorna ulima e se estiver vazio, retorna nulo
        println()

        val receitaComMaisDe500caloriasPrimeira = dados.firstOrNull { it.calorias > 500 } // retorna primeira com > 500 calorias
        val receitaComMaisDe500caloriasUltima = dados.lastOrNull { it.calorias > 500 }    // retorna última com > 500 calorias

        println(receitaComMaisDe500caloriasPrimeira)
        println(receitaComMaisDe500caloriasUltima)
    }


    // first


    // last



}

