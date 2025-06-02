// Map - chave, valor
// nao aceita valor repetido

fun main(){

    // imutável
    val map1 = mapOf(Pair("chave", "valor"))

    // mutável
    val map2 = mutableMapOf(Pair("chave 1", "valor"), Pair("chave 2", "valor 2"))

    println(map2)

    // adicionando valores
    map2["chave 3"] = "valor 3"
    println(map2)

    // removendo valores
    map2.remove("chave 2")
    println(map2)
    println()

    // mutável
    val map3 = mutableMapOf(Pair(1, "valor"), Pair(2, "valor 2"))

    // imprimi todas as chaves e todos os valores
    println(map3.keys)
    println(map3.values)


    // verificando se contem chave ou valor
    println(map3.containsKey(1))
    println(map3.containsKey(3))
    println(map3.containsValue("valor"))

    // verificando tamanho
    println(map3.size)

    // limpando
    map3.clear()
    println(map3)
    println()

    // outra maneira de criar um map
    val config = mutableMapOf(
        "URL" to "www.google.com",
        "URL2" to "www.r7.com"
    )

    println(config)

}

