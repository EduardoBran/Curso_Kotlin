fun calculaBonus2(cargo: Cargo): Float { // "cargo" vem de calculaBonusEnum
    return if (cargo == Cargo.DIRETOR) {
        5000F
    } else if (cargo == Cargo.GERENTE) {
        3000F
    } else {
        2000F
    }
}

fun main() {

    val p = PessoaComConstrutor("Junior", 2014)

    // with nao precisa usar "p."
    with(p) {
        nome
        documento
    }
}
