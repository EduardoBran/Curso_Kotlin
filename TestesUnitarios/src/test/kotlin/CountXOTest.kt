import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.fail

class CountXOTest {

    @Test
    @DisplayName("Teste a quantidade de x e o.")
    fun textCountXO(){
        // Assertions = biblioteca de testes unitários
        // Desta forma se UM falhar, ele mostrará como falha
//        Assertions.assertTrue { countXO("xxoo")} // funcionalidade para conseguir o teste, quer assegurar que o retorno passado é True
//        Assertions.assertFalse { countXO("xxxoo")}
//        Assertions.assertTrue { countXO("xxxoo")}

        // Forma de exibir o resultado de cada teste.
        Assertions.assertAll({
            Assertions.assertTrue { countXO("xxoo")}
        },{
            Assertions.assertFalse { countXO("xxxoo")}
        },{
            Assertions.assertTrue { countXO("xxoo")}
        })
    }

    // Adicionar possível teste que ainda não está pronto
    @Test
    @Disabled
    fun naoImplementado() {
        //comentários
    }

    // Outra abordagem de teste não implementado
    @Test
    fun vaiFalhar(){
        fail("Ainda não implementado")
    }

    @Test
    fun rodaBaseadoEmCondicao(){
        // assumindo uma suposição
        // assume que qualquer condição abaixo desse vai ser executado somente se este passar (resultado True)
        Assumptions.assumeTrue { countXO("xxoo") }

        // Garante que os dois valores são iguais
        Assertions.assertEquals(true, countXO("xxoo"))
    }

    @Test
    fun lancaExcecao(){
        // garantindo que uma excecao é lançada
        assertThrows<IndexOutOfBoundsException>() {
            throw IndexOutOfBoundsException()
        }
    }

    @Test
    fun testNotNull(){
        // garante que a funcao nao retorne nulo
        Assertions.assertNotNull(countXO("sadsa"))
    }
}

// clicar com botão direito na pasta test > More Run/Debug < Test Coverage
// mostra um relatório de tudo que foi festado