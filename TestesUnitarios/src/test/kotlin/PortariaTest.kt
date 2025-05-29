import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest {

//    Para atingir 100 % de cobertura em Portaria.kt você precisará de casos
//    que exercitem todas as saídas e todos os caminhos condicionais:

    val negadoMenorDeIdade = "Negado. Menores de idade não são permitidos."
    val conviteInvalido = "Negado. Convite inválido."
    val welcome = "Welcome :)"

    // Rejeição por idade
    @Test
    @DisplayName("Negar entrada para Menos de Idade")
    fun validaMenoresDeIdade(){
        val res = portaria(15, "", "")
        Assertions.assertEquals(negadoMenorDeIdade, res)
    }

    // Rejeição por tipo de Convite
    @Test
    @DisplayName("Negar entrada para Tipo de Convite Inválido")
    fun validaTipoDeConvite(){
        val res = portaria(25, "asdad", "")
        Assertions.assertEquals(conviteInvalido, res)
    }

    @Test
    @DisplayName("Negar entrada para Tipo de Convite Comum com Codigo Inválido")
    fun validaTipoDeConviteComum(){
        val res = portaria(25, "comum", "xx54")
        Assertions.assertEquals(conviteInvalido, res)
    }

    @Test
    @DisplayName("Negar entrada para Tipo de Convite Premium com Codigo Inválido")
    fun validaTipoDeConvitePremium(){
        val res = portaria(25, "premium", "xx54")
        Assertions.assertEquals(conviteInvalido, res)
    }

    @Test
    @DisplayName("Negar entrada para Tipo de Convite Luxo com Codigo Inválido")
    fun validaTipoDeConviteLuxo(){
        val res = portaria(25, "luxo", "xx54")
        Assertions.assertEquals(conviteInvalido, res)
    }

    @Test
    @DisplayName("Permitir entrada para Tipo de Convite Comum com Codigo Válido")
    fun validaTipoDeConviteComumValido(){
        val res = portaria(25, "comum", "xt54")
        Assertions.assertEquals(welcome, res)
    }

    @Test
    @DisplayName("Permitir entrada para Tipo de Convite Premium com Codigo Válido")
    fun validaTipoDeConvitePremiumValido(){
        val res = portaria(25, "premium", "xl54")
        Assertions.assertEquals(welcome, res)
    }

    @Test
    @DisplayName("Permitir entrada para Tipo de Convite Luxo com Codigo Válido")
    fun validaTipoDeConviteLuxoValido(){
        val res = portaria(25, "luxo", "xl54")
        Assertions.assertEquals(welcome, res)
    }

    @Test
    @DisplayName("Negar entrada para Tipo de Convite Luxo sem Código")
    fun validaTipoDeConviteLuxoSemCodigo(){
        val res = portaria(25, "luxo", "")
        Assertions.assertEquals(conviteInvalido, res)
    }

}