package character

import kotlin.random.Random

/**
 * Classe abstrata que representa um personagem no jogo.
 * Define atributos básicos como vida, ataque e defesa, além de métodos para ataque e dano.
 */
abstract class Character(
    /**
     * Quantidade de vida do personagem.
     */
    protected var health: Int,

    /**
     * Poder de ataque do personagem.
     */
    protected val attack: Int,

    /**
     * Poder de defesa do personagem.
     */
    protected val defense: Int
) {

    /**
     * Méto0do abstrato que deve ser implementado por subclasses para definir o ataque do personagem.
     */
    abstract fun attack(): Int

    /**
     * Aplica dano ao personagem, considerando a sua defesa.
     */
    fun receiveDamage(damage: Int) {
        // Exercicio: Pesquise como implementar 25% de chance do personagem esquivar do ataque. (concluído)

        val chance =  Random.nextInt(4)
        if (chance == 0) {
            println("$this esquivou do ataque")
            return
        }

        val damageTaken = maxOf(damage - defense, 0)
        health = maxOf(health - damageTaken, 0)

        println("$this recebeu $damageTaken de dano! Vida atual: $health")
    }

    /**
     * Verifica se o personagem ainda está vivo.
     */
    // Exercicio: É possível transformar em uma função de única linha? (concluído)
    fun isAlive(): Boolean = health > 0
}