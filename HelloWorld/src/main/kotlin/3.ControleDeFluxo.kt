fun maiorDeIdade(idade: Int): Boolean{
    return idade >= 18
}

fun maiorDeIdade2(idade: Int): Boolean = (idade >= 18)

// informatica - 500 | geografia - 600
fun mensalidadeCurso(curso: String): Double{
    if (curso == "informatica"){
        return 500.0
    } else if (curso == "geografia"){
        return 600.0
    } else {
        return 700.0
    }
}

fun mensalidadeCurso2(curso: String): Double{
    var mensalidade = 700.0

    if (curso == "informatica"){
        mensalidade = 500.0
    } else if (curso == "geografia"){
        mensalidade = 600.0
    }
    return mensalidade
}

fun mensalidadeCurso3(curso: String): Double{
    return if (curso == "informatica"){
        500.0
    } else if (curso == "geografia"){
        600.0
    } else {
        700.0
    }
}

fun mensalidadeCurso4(curso: String): Double{
    return when (curso) {
        "informatica" -> {
            500.0
        }
        "geografia" -> {
            600.0
        }
        else -> {
            700.0
        }
    }
}

fun main() {

//    val str = "Programação Kotlin"
//
//    if(str.contains("2")){
//        println("Contém Kotlin")
//    }else{
//        println("Não contém")
//    }

    println(maiorDeIdade(20))
    println(maiorDeIdade2(15))
    println(mensalidadeCurso("matematica"))
}