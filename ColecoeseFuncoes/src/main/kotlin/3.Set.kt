// Set - funcionalidade principal é não permitir elementos duplicados.

fun main(){

    // imutável
    val set = setOf<Int>(1, 2, 2, 3)
    println(set)


    // mutável
    val set2 = mutableSetOf<Int>(1, 2, 2, 3)
    println(set2)

    // adicionar o remover não tem 'index' como em List
    set2.add(4)
    set2.remove(1)
    println(set2)

}