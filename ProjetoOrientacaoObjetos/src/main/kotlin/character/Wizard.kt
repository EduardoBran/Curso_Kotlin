package character

/**
 * Classe que representa um Mago no jogo.
 */
class Wizard(health: Int, attack: Int, defense: Int) : Character(health, attack, defense) {

    /**
     * Retorna o poder de ataque do Mago.
     */
    override fun attack(): Int = attack

    /**
     * Representação textual do Mago.
     */
    override fun toString(): String {
        // Exercicio: Como melhorar para imprimir o nome do herói?
        val nome = this::class.simpleName
        return "$nome(vida = $health, ataque = $attack, defesa = $defense"
    }

    // override fun toString(): String = "Mago" // (concluído: forma 2)
}