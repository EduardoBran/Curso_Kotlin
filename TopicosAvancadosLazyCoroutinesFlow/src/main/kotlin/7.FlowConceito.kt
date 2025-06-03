/*
Conceito de Flow
- Flow é uma fluxo assíncrono e “frio” de múltiplos valores.
- Em vez de retornar um único resultado, ele emite uma sequência de valores ao longo do tempo.
- Por ser “frio”, nada acontece até alguém chamá-lo (colecionar ou consumir).

Quando usar
- Dados que mudam com o tempo: por exemplo, atualizações periódicas de dados de sensor ou de banco de dados.
- Streams de eventos: cliques de usuário, mensagens recebidas, resultados parciais de cálculo, progresso de download, etc.
- Combinar várias fontes: unir dados de rede, cache e banco em um único fluxo de atualizações.

Por que usar
 - 1. Reatividade leve: em vez de callbacks aninhados, o Flow permite usar operadores (map, filter, collect) para
      transformar/filtrar valores de maneira encadeada.
 - 2. Backpressure automático: se quem consome estiver “lento”, o Flow pausa emissões até o consumidor processar o que já chegou.
 - 3. Cancelamento estruturado: herda o cancelamento do escopo pai (como coroutineScope ou viewModelScope),
      evitando vazamento de coroutines.
 */

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// 1) Função que cria um Flow de números de 1 a 5, um a cada 300ms
fun contador(): Flow<Int> = flow{
    for (i in 1..5){
        delay (1500)  // simula trabalho/espera
        emit(i)         // emite o próximo valor
    }
}

fun main() = runBlocking {
    println("Iniciando o fluxo do contador...")

    // 2) Aplica um operador map para dobrar cada número
    val fluxoDobrados: Flow<Int> = contador().map {numero -> numero * 2}

    // 3) Coleta (consume) o fluxo, imprimindo às vezes diferidas
    fluxoDobrados.collect() { valor ->
        println("Recebido: $valor")
    }
    delay(1500)

    println("Fluxo concluído.")
}