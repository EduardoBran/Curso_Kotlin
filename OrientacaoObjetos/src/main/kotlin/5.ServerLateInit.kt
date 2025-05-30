class DataBase {
    // inicializa um banco de dados
    fun openConnection(){
        // lógica
        println("Conexão Estabelecida.")
    }
}

class Server {

    // lateinit significa que a variável foi declarado e for inicializado em momento oportuno ou tardio
    lateinit var db: DataBase

    fun initServer() {
        // precisa verificar se a variável já foi inicializada
        if (!::db.isInitialized){ // verificando se não está inicializada
            db = DataBase()
        }
        db.openConnection()
    }

}

fun main(){
    val server = Server()
    server.initServer()
}