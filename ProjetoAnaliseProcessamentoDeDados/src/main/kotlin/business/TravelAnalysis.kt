package business

import entity.Ship
import entity.Travel
import utils.ShipType
import java.math.BigDecimal
import java.math.RoundingMode

class TravelAnalysis private constructor() {
    companion object {

        // Quantos Navios do tipo Pirata a frota possui?
        fun countPirateShips(ships: List<Ship>): Int {
            val qtdNaviosPiratas = ships.count { it.type == ShipType.PIRATE }
            return qtdNaviosPiratas
        }

        // Qual o valor da viagem mais cara?
        fun getMostExpensiveTravel(travels: List<Travel>): Double? {
            val viagemMaisCara = travels.maxOfOrNull { it.cost } ?: 0.0  // "?: 0.0 para caso retorne nulo
            return BigDecimal(viagemMaisCara).setScale(2, RoundingMode.HALF_UP).toDouble()

            // return travels.maxOf { it.cost }
        }

        // Qual foi o custo médio das viagens para o Black Pearl?
        fun getAverageCostForBlackPearl(ships: List<Ship>, travels: List<Travel>): Double {
            val navioBlackPearl = travels.filter { it.ship.name == "Black Pearl" }
            val mediaBlackPearl = navioBlackPearl.map { it.cost }.average()

            return BigDecimal(mediaBlackPearl).setScale(2, RoundingMode.HALF_UP).toDouble()
        }

        // Qual o nome do navio com a maior capacidade de carga?
        fun getShipWithBiggestCargoCapacity(ships: List<Ship>): String {
            val maiorCarga = ships.maxByOrNull { it.cargoCapacity }?.name

            return maiorCarga.toString()

            // val maiorCarga = ships.maxByOrNull { it.cargoCapacity }?.name ?: ""   (Elvis Operator)

            // return maiorCarga
        }

        // Qual o nome do que navio fez a viagem mais longa? E qual a duração?
        fun getShipNameForLongestTravelAndDuration(travels: List<Travel>): Map<String, Int> {

            val maisLonga = travels.maxByOrNull { it.durationDays }
            val nome = mapOf(Pair(maisLonga?.ship?.name ?: "", maisLonga?.durationDays ?: 0)) // (Elvis Operator)

            return nome
        }

        // Listar nomes de todos os navios
        // Retorne uma lista contendo apenas os nomes de todos os objetos Ship gerados pelo DataStorage.
        fun getListNameOfAllShips(travels: List<Travel>): List<Any> {
            val lista = travels.map { it.ship.name }.distinct()

            lista.forEach { nome ->
                println("- $nome")
            }

            return lista
        }

        // Filtrar viagens de custo abaixo do valor informado
        // Crie um méto0do que receba a lista de Travel e retorne apenas as viagens cujo cost seja
        // menor ou igual a esse limite. filterTripsBelow20000

        fun getFilterTripsBelowValue(value: Double, travels: List<Travel>): List<Pair<String, Double>> {

            val valor = value

            if (value < 0){
                println("Valor Inválido")
                return emptyList()
            }

            val valores = travels
                .filter { it.cost < value }
                .map { it.ship.name to it.cost }

            valores.forEach { (nome, custo) ->
                println("- $nome: $custo")
            }

            return valores
        }

        // Somar todas as distâncias percorridas
        // Implemente uma função que receba a lista de Travel e retorne a soma de todas as propriedades distance presentes.
        // sumOfAllDistancesTraveled

        fun getSumOfAllDistancesTraveled(travels: List<Travel>): Double {
            return travels.sumOf { it.cost }
        }


        // Obter mapa de viagens agrupadas por nome do navio
        // Produza um Map<String, List<Travel>> que agrupe cada viagem pelo ship.name, ou seja, para cada nome de navio
        // você terá a lista de todas as viagens realizadas por ele. mapOfGroupedTripsByShipName

        fun getMapOfGroupedTripsByShipName(travels: List<Travel>): Map<String, List<Travel>>{

            return travels.groupBy { it.ship.name }
        }


        // Calcular o total de custos por navio
        // Usando o resultado do item anterior, crie uma função que converta esse agrupamento em um Map<String, Double>
        // onde a chave é o nome do navio e o valor é a soma de todos os cost das viagens daquele navio. totalCostsPerShip

        fun getTotalCostsPerShip(travels: List<Travel>): Map<String, Double>{

            val viagens = travels.groupBy { it.ship.name }
            val totalPorNavio = viagens
                .mapValues { (_, listaDeViagens) ->
                    listaDeViagens.sumOf { it.cost }
                }

            return totalPorNavio
        }


        // Detectar navio sem viagens
        // Crie um mét0do que receba as listas de Ship e Travel e retorne uma lista de nomes de navios que não aparecem em nenhuma Travel.
        // Ou seja, identifique quais Ship foram gerados, mas nunca tiveram uma viagem associada. shipsWithoutTrips
        fun getShipsWithoutTrips(ships: List<Ship>, travels: List<Travel>): List<String> {

            val travels = travels.map { it.ship.name }.toSet() // remove nomes duplicados

            return ships
                .map { it.name }
                .filter { it !in travels }

        }


    }
}

/*
Contém a lógica de negócios (regras de análise) sobre conjuntos de navios e de viagens.
Cada mét0do responde a uma pergunta específica, por exemplo:

- Quantos navios do tipo pirata existem?
- Qual a viagem mais cara?
- Custo médio das viagens do “Black Pearl”?
- Nome do navio com maior capacidade de carga?
- Navio que fez a viagem mais longa e duração dessa viagem?
 */