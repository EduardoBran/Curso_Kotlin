fun main (){
    // null safety
    // val str: String == null -> resulta em erro

    // atribuindo valor nulo da forma correta
    val str: String? = null

    //println(str.length) -> resulta em eroo

    println(str?.length)
    // println(str!!.length) // roda o código mesmo que pode ocorrer erro


    // Excessoes

    // println(str!!.length)

    // println(10 / 0)

    // val abc = "adadadas"
    // abc[100]


    // Tratando Código Sucetível a Excessão

//    try {
//        val str2: String? = null
//        println(str!!.length)
//    } catch (e: NullPointerException){
//        println("NullPointerException tratada")
//    }
//
//    try {
//        println(10 / 0)
//    } catch (e: ArithmeticException){
//        println("ArithmeticException tratada")
//    }
//
//    try{
//        val abc = "aadsadsa"
//        println(abc[100])
//    } catch (e: IndexOutOfBoundsException){
//        println("Erro - Index inexistente.")
//    }

    // Tratando as 3 exceções em um único try catch

    try{
        val str2: String? = null
        println(str2!!.length)
        println(10 / 0)
        val abc = "aadsadsa"
        println(abc[100])
    } catch (e: NullPointerException){
        println("NullPointerException tratada")
    } catch (e: ArithmeticException){
        println("ArithmeticException tratada")
    } catch (e: IndexOutOfBoundsException){
        println("Erro - Index inexistente.")
    }

    try{
        val str2: String? = null
        println(str2!!.length)
        println(10 / 0)
        val abc = "aadsadsa"
        println(abc[100])
    } catch (e: Exception) {
        println("Genérica")
    }


    // Lançando Exceção

    fun divisaoPorZero(n1: Int, n2: Int): Int {

        if (n1 == 0 || n2 == 0) {
            throw Exception("Divisão não pode ser zero")
        }
        println(n1/n2)
        return n1/n2
    }

    divisaoPorZero(0,5)
}