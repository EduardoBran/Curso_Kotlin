package entity

import utils.ShipType

data class Ship(
    val name: String,
    val cargoCapacity: Double,
    val type: ShipType,
    val fuelCapacity: Double
)

/*
Modela a entidade “Navio” como um objeto de dados (data class). Contém informações estáticas de cada navio:

- name (nome do navio)
- cargoCapacity (capacidade de carga em toneladas)
- type (categoriza usando ShipType)
- fuelCapacity (capacidade de combustível)

Isso permite transportar facilmente instâncias de Ship por t0do o projeto sempre que for necessário trabalhar com navios.

 */