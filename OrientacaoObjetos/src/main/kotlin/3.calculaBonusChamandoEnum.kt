
fun calculaBonus(cargo: Cargo): Float { // "cargo" vem de calculaBonusEnum
    return if (cargo == Cargo.DIRETOR) {
        5000F
    } else if (cargo == Cargo.GERENTE) {
        3000F
    } else {
        2000F
    }
}

fun main() {
    calculaBonus(Cargo.DIRETOR)
    Prioridade.ALTA.id

    for (p in Prioridade.entries){
        println(p)
    }
    for (p in Prioridade.entries){
        println(p.id)
    }
}