/*
List
 - Estrutura ordenada de elementos, que pode conter duplicatas.
 - Cada item tem um índice (posição) começando em zero.
 - Em Kotlin: List<T> é imutável (não permite adicionar ou remover), MutableList<T> permite modificações.

Set
 - Coleção de elementos únicos (não permite duplicatas).
 - Não há garantia de ordem (apesar de implementações específicas poderem manter ordem de inserção).
 - Em Kotlin: Set<T> é imutável, MutableSet<T> permite adicionar e remover.

Map
 - Conjunto de pares chave–valor.
 - Cada chave é única; cada chave mapeia exatamente um valor.
 - Em Kotlin: Map<K, V> é imutável, MutableMap<K, V> permite inserir, atualizar e remover pares.

Diferenças principais

1. Permissão de duplicatas
 - List: aceita valores repetidos (por exemplo, [A, B, A]).
 - Set: não aceita duplicatas (por exemplo, ao inserir A duas vezes, permanece apenas uma ocorrência).
 - Map: não permite duplicar chaves; já os valores podem se repetir livremente.

2. Acesso aos elementos
 - List: acesso por índice (ex.: list[0]).
 - Set: não há índice – para verificar existência, usa-se operações como contains(elemento).
 - Map: acesso por chave (ex.: map[chave] retorna o valor associado).

3. Estrutura interna e uso típico
 - List: usada quando a ordem importa e queremos iterar em sequência ou acessar por posição.
 - Set: usada quando precisamos garantir unicidade rápida (por exemplo, checar se um elemento existe sem duplicação).
 - Map: usada para representar dicionários, onde se busca um valor a partir de uma chave.

4. Mutabilidade
 - Em Kotlin, há versões imutáveis (somente leitura) e mutáveis (que permitem alteração) para cada tipo:
     - List vs. MutableList
     - Set vs. MutableSet
     - Map vs. MutableMap

Resumo das diferenças fundamentais:

 - Lista: ordenada, permite duplicatas, acesso por índice.
 - Conjunto (Set): não ordenado (ou ordem não garantida), sem duplicatas, busca rápida por existência.
 - Mapa (Map): estrutura de pares chave→valor, chaves únicas, acesso direto por chave.

*/