fun empacotar(x: Any, y: Any, z: Any): Any{
    return println("$x $y $z")
}

// antes de receber os parâmetros verifica qual tipo está a receber
fun <T> empacotar2(x: T, y: T, z: T) {
    return println("$x $y $z")
}

// definindo tipo genérico (T) em uma classe

class MyClass<T> {
    fun save(value: T) {}
    fun delete(value: T) {}
}

fun main(){

    empacotar(10, "asa", true)
    empacotar2(10, "asa", true)


}