import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    // é necessário adicionar a dependencia em build.gradle.kts

    println("a")
    println("b")
    runBlocking { // runBlocking (funcionalidade da dependecia nova capaz de rodar códigos assíncronos) mas bloqueando a aplicação
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

suspend fun helloWorld() { // suspend - funcao assincrona (nao pode ser chamada diretamente dentro do main
    println("ola mundo")
}

/*
Conceito de Coroutines
- Coroutines são funções “suspensas” que permitem escrever código assíncrono de forma sequencial, sem bloquear threads.
  Em vez de criar novas threads para cada tarefa concorrente, uma única thread pode executar várias coroutines,
  suspender uma enquanto aguarda um resultado (por exemplo, leitura de rede) e retomar depois. Isso torna o uso de
  recursos muito mais leve que threads tradicionais.

Quando usar

1. Operações de I/O ou rede: chamadas a APIs REST, acesso a banco de dados ou leitura/gravação de arquivos sem travar a interface.
2. Tarefas demoradas: cálculos complexos que podem ser divididos em etapas, evitando congelar a aplicação.
3. Fluxos de dados reativos: trabalhar com streams (por exemplo, séries de eventos do usuário) de forma não bloqueante.
4. Concorrência leve: quando precisar disparar várias tarefas em paralelo (como várias requisições simultâneas)
                      sem sobrecarregar o sistema com threads.

Para que usar

1. Evitar bloqueio de UI (Android, desktop, etc.)
- Em apps que têm interface, coroutines permitem executar tarefas demoradas em “background” sem congelar a tela.

2. Economia de recursos
- Ao suspender uma coroutine, a thread que a rodava fica livre para outras tarefas. É mais eficiente que criar centenas de threads.

3. Código mais legível
- Em vez de callbacks aninhados, usa-se a sintaxe sequencial (com suspend), tornando o fluxo assíncrono mais claro.

4. Tratamento de concorrência estruturada
- Com scopes (CoroutineScope) e hierarquias, as coroutines garantem cancelamento e tratamento de erros de forma organizada.

-> Resumo: Use coroutines sempre que precisar de tarefas simultâneas (ex.: carregar dados da internet, calcular algo pesado)
           sem travar a aplicação e sem criar muitas threads. Elas permitem escrever código assíncrono de modo simples e
           eficiente, aproveitando melhor os recursos do sistema e mantendo a lógica mais clara.
 */