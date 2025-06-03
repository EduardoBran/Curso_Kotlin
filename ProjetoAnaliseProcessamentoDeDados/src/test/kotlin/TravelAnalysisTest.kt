import business.TravelAnalysis
import data.DataStorage
import entity.Travel
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TravelAnalysisTest{

    // obtém a massa de dados
    private val ships = DataStorage.generateShips()
    private val travels = DataStorage.generateTravels()

    // Viagem Mais Cara
    @Test
    @DisplayName ("Valida quantidade de navios Pirata a frota possui")
    fun testHowManyPiratesShipsTheFleetHas(){
        assertEquals(2, TravelAnalysis.countPirateShips(ships))
    }

    // Valor da viagem mais cara
    @Test
    @DisplayName ("Valida o valor da viagem mais cara.")
    fun testMostExpensiveTravel(){
        assertEquals(40000.0, TravelAnalysis.getMostExpensiveTravel(travels))
    }

    // Valor Médio Black Pearl
    @Test
    @DisplayName ("Valida o custo médio das viagens para o Black Pearl.")
    fun testAverageCostForBlackPearl(){
        assertEquals(15666.67, TravelAnalysis.getAverageCostForBlackPearl(ships, travels))
    }

    // Nome do navio com maior capacidade de carga
    @Test
    @DisplayName("Valida o navio com a maior capacidade de carga.")
    fun testShipWithBiggestCargoCapacity(){
        assertEquals("Queen Mary", TravelAnalysis.getShipWithBiggestCargoCapacity(ships))
    }

    // Navio com viagem mais longa e a duração
    @Test
    @DisplayName("Valida o nome do navio que fez a viagem mais longa e sua duração.")
    fun testShipNameForLongestTravelAndDuration(){
        val teste = TravelAnalysis.getShipNameForLongestTravelAndDuration(travels)
        val esperado = mapOf("Queen Mary" to 15)
        assertEquals(teste, esperado)
    }

    // Navio com viagem mais longa e a duração
    @Test
    @DisplayName("Valida o nome do navio que fez a viagem mais longa e sua duração 2.")
    fun testShipNameForLongestTravelAndDuration2(){
        val teste = TravelAnalysis.getShipNameForLongestTravelAndDuration(travels)
        assertTrue(teste["Queen Mary"] == 15)
    }

}
