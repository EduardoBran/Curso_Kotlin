/*
Conceito de Funções Higher-Order
- Higher-Order Functions são funções que recebem outras funções como parâmetro ou retornam funções como resultado.
- Em Kotlin, qualquer função que tenha tipo de parâmetro como
  (Tipo) -> Retorno ou que retorne um (Tipo) -> Retorno é considerada de ordem superior.

Quando usar
 - 1. Abstrair comportamento repetitivo: Se você tem várias partes do código que variam só em “o que acontece no meio”, pode criar
      uma função genérica que receba um bloco para esse passo variável.
 - 2. Customizar lógica em tempo de execução: Permite passar lambdas para indicar “faça X” ou “faça Y” sem precisar
      duplicar toda a estrutura de código.
 3. Construir DSLs ou APIs fluentes: Muitas APIs de Kotlin (como funções de coleção filter, map, forEach) usam lambdas
    para permitir escrita concisa de lógica.

Por que usar
- Reuso e clareza: em vez de repetir um loop ou checagem em vários lugares, você define uma única função higher-order
  e só muda o lambda passado.
- Código conciso: lambdas inline evitam boilerplate de classes anônimas ou múltiplos métodos quase idênticos.
- Flexibilidade: quem chama a função decide “o que” será executado naquele passo sem alterar a função em si.
*/

// Higher-order function que recebe uma lista de Int e uma operação qualquer para aplicar a cada elemento
fun processarLista(
    lista: List<Int>,
    operacao: (Int) -> Int // parâmetro que é uma função: recebe Int e retorna Int
): List<Int>{

    val resultado = mutableListOf<Int>()
    for (item in lista) {
        // chama 'operacao' passando 'item'
        resultado.add(operacao(item))
    }
    return resultado
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    // Chamando processarLista para dobrar cada número
    val dobrados = processarLista(numeros) { x -> x * 2 }
    println(dobrados) // [2, 4, 6, 8, 10]

    // Chamando processarLista para somar 100 a cada número
    val maisCem = processarLista(numeros) { x -> x + 100 }
    println(maisCem) // [101, 102, 103, 104, 105]
}

/*
Explicação do exemplo:
 - 1. processarLista é uma função higher-order porque recebe um parâmetro operacao: (Int) -> Int.
      Esse parâmetro é uma função que aceita um Int e retorna outro Int.
 - 2. Dentro de processarLista, para cada elemento da lista, chamamos operacao(item). O comportamento exato
     (dobrar, somar 100, ou qualquer outra coisa) depende do lambda que passamos na chamada.
 - 3. No main, usamos:
    - processarLista(numeros) { x -> x * 2 } para “dobrar” cada valor.
    - processarLista(numeros) { x -> x + 100 } para “somar 100”.

- 4. Assim, evitamos ter duas funções quase idênticas (“dobrarLista” e “somarCemLista”). Basta mudar o lambda passado.
 */