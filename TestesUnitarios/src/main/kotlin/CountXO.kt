fun countXO(str: String): Boolean {
    val texto = str.lowercase()
    var countX = 0
    var count0 = 0

    var length = texto.length

    while (length > 0){
        if (texto[length - 1] == 'x'){ // Se length vale 5, length - 1 é 4, que é o índice do quinto caractere (índices começam em 0).

            countX++
        }
        if (texto[length - 1] == 'o'){
            count0++
        }
        length--
    }
    return (countX == count0 && count0 != 0)
}