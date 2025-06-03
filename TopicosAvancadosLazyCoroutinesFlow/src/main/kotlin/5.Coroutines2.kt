import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    println("a")
    println("b")
    runBlocking { // bloquea a thread principal (nao é recomendado em código final da aplicação)
        launch {
            helloWorld()
            delay(2000)
            println("f1")
        }
        launch { 500 } // impresso primeiro
        println("f2")
    }

    println("c")
    println("d")


}
// diferentemente do runBlocking, a coroutineScope não bloqueia a thread principal e só pode ser chamada dentro de uma
// função assíncrona (suspensa)
suspend fun exemploCoroutineScope() = coroutineScope {
    println("Hello Worl")
}