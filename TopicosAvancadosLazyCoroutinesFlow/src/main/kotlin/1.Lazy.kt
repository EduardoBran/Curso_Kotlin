class ConfigManager {

    val UserLanguage = "pt-br"

    val databaseConfig: Map<String, String> by lazy {
        loadDatabaseConfiguration()
    }

    private fun loadDatabaseConfiguration(): Map<String, String> {
        return mapOf(Pair("Config", "bla bla"))
    }

}

fun main(){

    // cenário: tem uma variável muito pesado e não quer ocupar o processamento (memória) até quando precisar dela.
    val str: String = ""

    val variavelPesada: String by lazy{
        println("Inicializando")
        "bla bla bla bla"
    }

    println(variavelPesada) // só aqui inicializa a variável
    println()

    // cenário 2: usando em classe
    val configManager = ConfigManager()
    println(configManager.UserLanguage) // já inicializada e nao inicia databaseConfig e loadDataBaseConfiguration

}

/*

Quando usar

1. Inicialização custosa ou pesada
 - Quando criar o objeto demanda muito processamento, acesso a disco, banco de dados ou rede, e você quer só
   construí-lo se realmente for necessário.

2. Dependência de recurso que pode não existir imediatamente
- Por exemplo, usar lazy em objetos vinculados a Activity ou Fragment que só estão disponíveis após um ciclo de
  vida específico.

3. Evitar inicialização no construtor
- Se a classe tem várias propriedades, mas nem todas serão realmente usadas em todas as execuções, deixa-las
  lazy evita Work desnecessário.

Para que usar

1. Economia de recursos: adia cálculo ou criação até o momento exato de uso.
2. Ciclos de vida: garante que algo só será instanciado depois que todos os pré-requisitos existirem (por ex., context em Android).
3. Thread-safety (opcional): por padrão, lazy é seguro para acesso concorrente (LazyThreadSafetyMode.SYNCHRONIZED);
    há modos sem sincronização para otimizar desempenho.

-> Use lazy sempre que quiser adiar a criação de algo até o exato momento de uso, economizar processamento
   ou respeitar dependências de ciclo de vida, garantindo também inicialização única e, se desejar,
   proteção para múltiplas threads.
 */