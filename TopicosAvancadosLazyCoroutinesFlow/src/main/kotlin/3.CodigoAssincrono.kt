import kotlinx.coroutines.*

suspend fun fetchDataAsynchronously(): String {
    delay(1000) // suspende a coroutine por 1 segundo, liberando a thread
    return "Dados carregados"
}

fun main() = runBlocking {
    println("Iniciando busca assíncrona...")

    // Dispara a coroutine para buscar dados em paralelo
    val deferred: Deferred<String> = async {
        fetchDataAsynchronously()
    }

    println("Enquanto busca roda, posso fazer outras coisas aqui...")

    // Aguarda o resultado sem bloquear a thread de UI/principal
    val resultado = deferred.await()
    println("Resultado: $resultado")

    println("Continua execução após busca assíncrona")
}
