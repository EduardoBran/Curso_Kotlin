package data

import entity.Ship
import entity.Travel
import utils.ShipType

// A classe DataStorage não deve ser instanciada.
// Por isso, o construtor é privado: class DataStorage private constructor()
// Impede que alguém faça DataStorage() em outro lugar do código.
class DataStorage private constructor(){

    // O companion object funciona como um “lar” de métodos estáticos em Kotlin.
    // Tudo que está aqui pode ser chamado diretamente pela classe, sem instância.
    companion object {

        // Instâncias fixas de Ship. Cada navio precisa do enum ShipType,
        // que já foi definido em utils/ShipType.kt.
        private val blackPearl = Ship(
            name = "Black Pearl",
            cargoCapacity = 1000.0,
            type = ShipType.PIRATE,
            fuelCapacity = 5000.0
        )
        private val highCommander = Ship(
            name = "High Commander",
            cargoCapacity = 5000.0,
            type = ShipType.BATTLESHIP,
            fuelCapacity = 20000.0
        )
        private val queenMary = Ship(
            name = "Queen Mary",
            cargoCapacity = 8000.0,
            type = ShipType.CARGO,
            fuelCapacity = 15000.0
        )
        private val titanicII = Ship(
            name = "Titanic II",
            cargoCapacity = 7000.0,
            type = ShipType.CARGO,
            fuelCapacity = 12000.0
        )
        private val longBeard = Ship(
            name = "Long Beard",
            cargoCapacity = 1200.0,
            type = ShipType.PIRATE,
            fuelCapacity = 6000.0
        )

        // navios sem viagem
        private val ghostShip = Ship(
            name = "Ghost Ship",
            cargoCapacity = 500.0,
            type = ShipType.CARGO,
            fuelCapacity = 2000.0
        )

        private val ghostShipBlack = Ship(
            name = "Ghost Ship Black",
            cargoCapacity = 500.0,
            type = ShipType.CARGO,
            fuelCapacity = 2000.0
        )


        // Gera uma lista imutável de navios pré-definidos.
        // Como esses objetos Ship já existem acima, retornamos todos eles em uma List<Ship>.
        fun generateShips(): List<Ship> {
            return listOf(
                blackPearl,
                highCommander,
                queenMary,
                titanicII,
                longBeard,
                ghostShip,
                ghostShipBlack
            )
        }

        // Gera uma lista imutável de objetos Travel. Cada Travel associa um navio
        // a valores de distância, custo e duração de viagem.
        // Aqui utilizamos as mesmas instâncias de Ship definidas acima.
        fun generateTravels(): List<Travel>{
            return listOf(
                Travel(blackPearl, 1200.0, 10000.0, 5),
                Travel(highCommander, distance = 3000.0, cost = 25000.0, durationDays = 10),
                Travel(queenMary, distance = 4500.0, cost = 40000.0, durationDays = 15),
                Travel(titanicII, distance = 3200.0, cost = 35000.0, durationDays = 12),
                Travel(longBeard, distance = 1500.0, cost = 12000.0, durationDays = 6),
                Travel(blackPearl, distance = 800.0, cost = 7000.0, durationDays = 3),
                Travel(blackPearl, distance = 4000.0, cost = 30000.0, durationDays = 14),
                Travel(queenMary, distance = 2500.0, cost = 20000.0, durationDays = 9)
            )
        }
    }
}

/*
Cria dados fictícios (mock data) para t0do o sistema. Tem dois métodos principais:

- generateShips(): retorna uma lista pré-definida de objetos Ship.
- generateTravels(): retorna uma lista pré-definida de objetos Travel, associando viagens a navios.

Sua utilidade é fornecer uma “massa de dados” consistente para testes e demonstrações, sem depender de banco de dados real.

-> private constructor() garante que ninguém consiga fazer DataStorage() em outro lugar.
   Isso deixa claro que você não quer que existam múltiplas instâncias—tudo é tratado de forma puramente estática.

-> companion object é o espaço onde você declara as funções “estáticas” (generateShips(), generateTravels()) que ficam
   disponíveis como se fossem métodos de classe, e não de instância.
 */
