/*
Conceito de coroutineScope com async
- coroutineScope é uma função suspend que cria um escopo estruturado para coroutines. Dentro desse bloco, todas as
  coroutines lançadas (sejam via launch, async ou outras) são “filhas” do mesmo escopo e serão automaticamente
  canceladas em conjunto se alguma falhar.

- async é uma forma de lançar uma coroutine que retorna um valor (um Deferred<T>). Você pode chamar .await() nesse objeto
  para obter o resultado quando estiver pronto, sem bloquear a thread.

Quando usar juntos
Use coroutineScope { … } sempre que precisar:

- 1. Lançar várias coroutines em paralelo com async { … }.
- 2. Aguardar todas elas antes de continuar.
- 3. Garantir que, se uma falhar, as demais sejam canceladas de forma automática.

Isso evita “coroutines órfãs” e mantém o cancelamento estruturado.
 */

import kotlinx.coroutines.*

// Função suspend que executa duas tarefas em paralelo e retorna ambos os resultados
suspend fun buscarDadosEmParalelo(): Pair<String, String> = coroutineScope {
    // Lança duas coroutines simultâneas com async, cada uma retornando um valor
    val tarefaA = async {
        delay(900)       // simula operação que leva 500ms (por ex., leitura de API)
        "Resultado A"
    }
    val tarefaB = async {
        delay(800)       // simula outra operação que leva 800ms
        "Resultado B"
    }

    // Aguarda cada async sem bloquear a thread
    val resA = tarefaA.await()
    val resB = tarefaB.await()

    println("Função continuando...")

    // Só sai do coroutineScope quando ambas as coroutines terminarem
    Pair(resA, resB)
}

fun main() = runBlocking {
    println("Início")

    // Chama a função que usa coroutineScope + async
    val (a, b) = buscarDadosEmParalelo()

    println("Recebidos: $a e $b")
    println("Fim")
}
