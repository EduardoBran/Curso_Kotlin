/* Calculo de bunos de funcionario baseado em tempo de empresa
Menos de um ano -> 500
1 a 3 anos -> 2000
4 anos ou mais -> 5000

Diretor - 10000
 */

fun calculaBonus(tempo: Int): Float{
    if (tempo == 0){
        return 500F
    } else if ( tempo >=1 && tempo <= 3){
        return 2000F
    } else if ( tempo >= 4){
        return 5000F
    }
    return 0F
}

fun calculaBonus2(tempo: Int): Float{
    if (tempo == 0){
        return 500F
    } else if ( tempo in 1..3){
        return 2000F
    } else if ( tempo >= 4){
        return 5000F
    }
    return 0F
}

fun calculaBonus3(tempo: Int): Float{
    var bonus = 0F
    if (tempo == 0){
        bonus = 500F
    } else if ( tempo in 1..3){
        bonus = 2000F
    } else if ( tempo >= 4){
        bonus = 5000F
    }
    return bonus
}

fun calculaBonus4(tempo: Int, cargo: String): Float{
    var bonus = 0F
    if (cargo == "Diretor"){
        return 10000F
    } else {
        if (tempo == 0) {
            bonus = 500F
        } else if (tempo in 1..3) {
            bonus = 2000F
        } else if (tempo >= 4) {
            bonus = 5000F
        }
    }
    return bonus
}

fun calculaBonus5(tempo: Int, cargo: String): Float{
    if (cargo == "Diretor"){
        return 10000F
    }
    if (tempo == 0) {
        return 500F
    }
    if (tempo in 1..3) {
        return 2000F
    }
    if (tempo >= 4) {
        return 5000F
    }
    return 0F
}

fun main() {
    println(calculaBonus5(2, "Diretor"))
}