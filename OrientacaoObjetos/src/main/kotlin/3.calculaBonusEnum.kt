// enum - funcionalidade que define uma lista de numerados, um intervalo de valores que pode ser usado

enum class Cargo {
    DIRETOR, GERENTE
}

enum class Prioridade(val id: Int) {
    BAIXA(1), MEDIA(5), ALTA(30)
}