import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/* FUNÇÃO 1: exemplo de Flow com .onStart e .onCompletion
- Cria um Flow<String> que emite três strings, com delay(500) entre elas.
- .onStart { … } imprime antes de qualquer emit.
- .onCompletion { … } imprime assim que o fluxo termina (ou falha).
*/
fun fluxoComOnStartOnCompletion(): Flow<String> = flow {
    emit("Início da sequência")
    delay(500)
    emit("Meio da sequência")
    delay(500)
    emit("Fim da sequência")
}.onStart {
    println(">> onStart: começando a emitir valores")
}.onCompletion {
    println(">> onCompletion: terminei de emitir valores\n")
}

/* FUNÇÃO 2: exemplo usando .onEach
- Cria um Flow<Int> emitindo números de 1 a 5, a cada 300 ms.
- .onEach { … } executa um log para cada elemento antes de passar ao collect.
 */
fun fluxoComOnEach(): Flow<Int> = flow {
    for (i in 1..5) {
        emit(i)
        delay(300)
    }
}.onEach { valor ->
    println(">> onEach: valor intermediário = $valor")
}

/* FUNÇÃO 3: exemplo usando .asFlow para converter uma coleção em Flow
- Converte a lista listOf(2.5, 3.14, 4.0, 5.75) em um Flow<Double> usando .asFlow().
 */
fun fluxoComAsFlow(): Flow<Double> {
    val listaNumeros = listOf(2.5, 3.14, 4.0, 5.75)
    return listaNumeros.asFlow()
}

fun main() = runBlocking {
    println("=== Função 1: Flow com onStart e onCompletion ===")
    fluxoComOnStartOnCompletion().collect { valor ->
        println("collect recebeu: $valor")
    }

    println("=== Função 2: Flow com onEach ===")
    fluxoComOnEach().collect { valor ->
        println("collect processou: $valor\n")
    }

    println("=== Função 3: Flow criado via asFlow ===")
    fluxoComAsFlow().collect { valor ->
        println("collect (asFlow) recebeu: $valor")
    }
}
