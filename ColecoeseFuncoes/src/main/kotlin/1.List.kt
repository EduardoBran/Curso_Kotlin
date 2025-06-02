fun main(){

    // imutável (não pode editar)
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = listOf("asad", 1, 2, 3, 4, 5, 6, 7, 8)

    // mutável (pode editar)
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    println(list3)

    // adiciona numero 9 na ultima posicao
    list3.add(9)
    println(list3)

    // adiciona numero zero na primeira posicao
    list3.add(0, 0)
    println(list3)

    // verifica se contem um número
    println(list3.contains(8))
    println(list3.contains(10))

    // verifica tamanho
    println(list3.size)

    // limpa a lista
    list3.clear()
    println(list3)


}