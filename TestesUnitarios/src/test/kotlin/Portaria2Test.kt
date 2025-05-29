import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Portaria2Test {

    //    Para atingir 100 % de cobertura em Portaria.kt você precisará de casos
    //    que exercitem todas as saídas e todos os caminhos condicionais:

    // Rejeição por idade
    @Test
    fun rejeicaoPorIdadeInvalidoTest(){
        val resultado = evento(17, "", codigo = "")
        assertEquals(msgIdade, resultado)
    }
    @Test
    fun aceitacaoPorIdadeWelcomeTest(){
        val resultado = evento(20, "comum", codigo = "xt9999")
        assertEquals(msgBemVindo, resultado)
    }

    // Rejeição por Convite
    @Test
    fun rejeicaoPorConviteComumInvalidoTest(){
        val resultado = evento(20, convite = "outro", codigo = "xt9999")
        assertEquals(msgConvite, resultado)
    }
    @Test
    fun aceitacaoPorConviteComumWelcomeTest(){
        val resultado = evento(20, convite = "comum", codigo = "xt9999")
        assertEquals(msgBemVindo, resultado)
    }
    @Test
    fun rejeicaoPorConvitePremiumInvalidoTest(){
        val resultado = evento(20, convite = "outro", codigo = "xt9999")
        assertEquals(msgConvite, resultado)
    }
    @Test
    fun aceitacaoPorConvitePremiumWelcomeTest(){
        val resultado = evento(20, convite = "premium", codigo = "xl9999")
        assertEquals(msgBemVindo, resultado)
    }
    @Test
    fun rejeicaoPorConviteLuxoInvalidoTest(){
        val resultado = evento(20, convite = "outro", codigo = "xt9999")
        assertEquals(msgConvite, resultado)
    }
    @Test
    fun aceitacaoPorConviteLuxoWelcomeTest(){
        val resultado = evento(20, convite = "luxo", codigo = "xl9999")
        assertEquals(msgBemVindo, resultado)
    }

    // Rejeição por Código
    @Test
    fun rejeicaoPorCodigoComumInvalidoTest(){
        val resultado = evento(20, convite = "comum", codigo = "xx9999")
        assertEquals(msgCodigo, resultado)
    }
    @Test
    fun aceitacaoPorCodigoComumWelcomeTest(){
        val resultado = evento(20, convite = "comum", codigo = "xt9999")
        assertEquals(msgBemVindo, resultado)
    }
    @Test
    fun aceitacaoPorConvitePremiumComCodigoInvalidoTest(){
        val resultado = evento(20, convite = "premium", codigo = "xl9999")
        assertEquals(msgBemVindo, resultado)
    }
    @Test
    fun rejeicaoPorConvitePremiumComCodigoInvalidoTest(){
        val resultado = evento(20, convite = "premium", codigo = "xx9999")
        assertEquals(msgCodigo, resultado)
    }
    @Test
    fun aceitacaoPorConviteLuxoComCodigoInvalidoTest(){
        val resultado = evento(20, convite = "luxo", codigo = "xl9999")
        assertEquals(msgBemVindo, resultado)
    }
    @Test
    fun rejeicaoPorConviteLuxoComCodigoInvalidoTest(){
        val resultado = evento(20, convite = "luxo", codigo = "xx9999")
        assertEquals(msgCodigo, resultado)
    }

}