// Função que gera uma lista de receitas para uso no programa
// Retorna List<Receita2>, onde cada Receita2 pode ter zero ou mais Ingrediente2
private fun listaDeDados(): List<Receita2> {
    return listOf(
        // Receita com vários ingredientes
        Receita2(
            nome = "Lasanha",
            calorias = 1200,
            ingredientes = listOf(
                Ingrediente2(nome = "Presunto", quantidade = 5),
                Ingrediente2(nome = "Queijo", quantidade = 10),
                Ingrediente2(nome = "Molho de Tomate", quantidade = 2),
                Ingrediente2(nome = "Manjericão", quantidade = 3),
            )
        ),
        // Outra receita com vários ingredientes
        Receita2(
            nome = "Hamburguer",
            calorias = 2000,
            ingredientes = listOf(
                Ingrediente2(nome = "Pão", quantidade = 1),
                Ingrediente2(nome = "Hamburguer", quantidade = 3),
                Ingrediente2(nome = "Queijo", quantidade = 1),
                Ingrediente2(nome = "Catupiry", quantidade = 1),
                Ingrediente2(nome = "Bacon", quantidade = 3),
                Ingrediente2(nome = "Alface", quantidade = 1),
                Ingrediente2(nome = "Tomate", quantidade = 1)
            )
        ),
        // Receita sem ingredientes (usa construtor padrão para lista vazia)
        Receita2(nome = "Panqueca", calorias = 500),
        Receita2(nome = "Omelete", calorias = 200),
        Receita2(nome = "Parmegiana", calorias = 700),
        Receita2(nome = "Sopa de feijão", calorias = 300),
    )
}

// Data class que representa uma receita
// - nome: String     → nome da receita
// - calorias: Int    → valor calórico da receita
// - ingredientes:    → lista de Ingrediente2 (padrão: lista vazia)
data class Receita2(
    val nome: String,
    val calorias: Int,
    val ingredientes: List<Ingrediente2> = listOf()
)

// Data class que representa um ingrediente
// - nome: String       → nome do ingrediente
// - quantidade: Int    → quantidade necessária do ingrediente
data class Ingrediente2(
    val nome: String,
    val quantidade: Int
)


// Função que exibe de forma organizada cada receita e seus ingredientes
fun exibirReceitas(receitas: List<Receita2>) {
    receitas.forEach { receita ->
        println("–".repeat(40))
        println("Receita: ${receita.nome}")
        println("Calorias: ${receita.calorias}")
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


fun main(){
    val dados = listaDeDados()
    exibirReceitas(dados)
}