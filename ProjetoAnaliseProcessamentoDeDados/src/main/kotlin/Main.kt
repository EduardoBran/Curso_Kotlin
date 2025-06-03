import business.TravelAnalysis
import data.DataStorage

fun main() {

    //Obtém a massa de dados
    val ships = DataStorage.generateShips()
    val travels = DataStorage.generateTravels()

    println("Quantos navios do tipo Pirata a frota possui?")
    println("Possui ${TravelAnalysis.countPirateShips(ships)} navios. \n")

    println("Qual o valor da viagem mais cara?")
    println("A viagem mais cara custou ${TravelAnalysis.getMostExpensiveTravel(travels)} moedas de ouro. \n")

    println("Qual foi o custo médio das viagens para o Black Pearl?")
    println("Custo médio das viagens do Black Pearl foi ${TravelAnalysis.getAverageCostForBlackPearl(ships, travels)}. \n")

    println("Qual o nome do navio com a maior capacidade de carga?")
    println("Navio com a maior carga se chama ${TravelAnalysis.getShipWithBiggestCargoCapacity(ships)}. \n")

    println("Qual navio fez a viagem mais longa? E qual a duração?")
    val firstEntry = TravelAnalysis.getShipNameForLongestTravelAndDuration(travels).entries.firstOrNull()
    println("A viagem mais longa foi de ${firstEntry?.value} dias e pertence ao navio ${firstEntry?.key}. \n")

    println("Listar nomes de todos os navios")
    TravelAnalysis.getListNameOfAllShips(travels)
    println()

    println("Filtrar viagens de custo abaixo do valor 20000.0")
    TravelAnalysis.getFilterTripsBelowValue(20000.0, travels)
    println()


    println("Somar todas as distâncias percorridas")
    println("A soma de toda as distâncias percorridas foi: ${TravelAnalysis.getSumOfAllDistancesTraveled(travels)} \n")


    println("Obter mapa de viagens agrupadas por nome do navio")
    // Chama a função e armazena o resultado
    val mapaViagens = TravelAnalysis.getMapOfGroupedTripsByShipName(travels)

    // Para cada entrada (nome do navio → lista de viagens), imprime de maneira organizada
    mapaViagens.forEach { (nomeNavio, listaTravels) ->
        println("Navio: $nomeNavio")
        listaTravels.forEach { viagem ->
            // aqui você pode escolher o que mostrar de cada Travel (por exemplo, distância e custo)
            println("  • Distância: ${viagem.distance}, Custo: ${viagem.cost}, Duração: ${viagem.durationDays} dias")
        }
        println()
    }


    println("Calcular o total de custos por navio")
    println("A soma de toda as distâncias percorridas foi: ${TravelAnalysis.getTotalCostsPerShip(travels)}\n")
    val custosPorNavio = TravelAnalysis.getTotalCostsPerShip(travels)

    custosPorNavio.forEach { (nomeNavio, custo) ->
        println("Navio: $nomeNavio. Custo: $custo")
    }
    println()


    println("Detectar navio sem viagens")
    println(TravelAnalysis.getShipsWithoutTrips(ships, travels))
    println()

}

/*
Ponto de entrada do programa. Executa a sequência principal:

- Chama DataStorage.generateShips() e DataStorage.generateTravels() para obter dados.
- Exibe no console perguntas e respostas usando métodos de TravelAnalysis (ou stubs, até esses métodos serem implementados).

Serve para orquestrar a execução do fluxo de leitura de dados e apresentação dos resultados.
 */