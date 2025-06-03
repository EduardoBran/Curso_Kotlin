package entity

data class Travel (
    val ship: Ship,
    val distance: Double,
    val cost: Double,
    val durationDays: Int
)

/*
Modela a entidade “Viagem” como um objeto de dados (data class). Armazena, para cada viagem:

- ship (o navio que realizou a viagem)
- distance (distância percorrida)
- cost (custo da viagem)
- durationDays (duração em dias)

Serve para representar cada registro de deslocamento no sistema, ligando-o ao navio correspondente.


 */