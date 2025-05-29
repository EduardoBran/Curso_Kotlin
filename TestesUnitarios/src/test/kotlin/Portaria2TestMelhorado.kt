import kotlin.test.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Portaria2TestMelhorado {
    @ParameterizedTest
    @MethodSource("cenariosPortaria")
    fun testarTodosOsCenarios(idade: Int, tipo: String, codigo: String, esperado: String) {
        assertEquals(esperado, evento(idade, tipo, codigo))
    }

    companion object {
        @JvmStatic
        fun cenariosPortaria() = listOf(
            // idade, tipo, codigo, retorno
            arrayOf<Any>(17, "comum", "xt1234", msgIdade),
            arrayOf<Any>(20, "vip",   "xt1234", msgConvite),
            arrayOf<Any>(20, "comum", "xt0000", msgBemVindo),
            arrayOf<Any>(20, "comum", "xl0000", msgBemVindo),
            arrayOf<Any>(20, "premium", "xl0000", msgBemVindo),
            arrayOf<Any>(20, "premium", "xt0000", msgCodigo),
            arrayOf<Any>(20, "luxo",   "xl0000", msgBemVindo),
            arrayOf<Any>(20, "luxo",   "xt0000", msgCodigo),
            arrayOf<Any>(20, "comum", "xx0000",  msgCodigo)
        )
    }

}