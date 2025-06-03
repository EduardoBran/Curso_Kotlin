// Simula uma função que busca dados e leva 1 segundo para retornar
fun fetchDataSynchronously(): String {
    Thread.sleep(1000) // bloqueia a thread por 1 segundo
    return "Dados carregados"
}

fun main() {
    println("Iniciando busca síncrona...")
    val resultado = fetchDataSynchronously()  // aqui o programa “para” até receber o retorno
    println("Resultado: $resultado")
    println("Continua execução após busca síncrona")
}
