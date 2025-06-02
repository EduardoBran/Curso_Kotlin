package character

/**
 * Classe que representa um Goblin no jogo.
 */
class Goblin(health: Int, attack: Int, defense: Int) : Character(health, attack, defense) {

    /**
     * Retorna o poder de ataque do Goblin.
     */
    override fun attack(): Int = attack

    /**
     * Representação textual do Goblin.
     */

    // Exercicio: Como melhorar para imprimir o nome do inimigo?
    override fun toString(): String { // (concluído: forma 2)

        val nome = this::class.simpleName
        return "$nome(vida = $health, ataque = $attack, defesa = $defense"
    }
}