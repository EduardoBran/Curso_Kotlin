import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        sensorDeTemperatura()
            .onStart { println("Comecei a receber valores") }
            .onCompletion { println("Acabei de receber valores") }
            .collect {
            if (it > 4) {
                println("Muito Alto")
            } else {
                println(it)
            }
        }
    }
}

fun sensorDeTemperatura(): Flow<Int> {
    return flow<Int> {
//        emit(1)
//        delay(1000)
//        emit(2)
//        delay(1000)
//        emit(3)
//        delay(1000)

        for (i in 1..5){
            emit(i)
            delay(800)
        }
    }
}

// Flow - trabalha com fluxo de dados (data streams) e trabalha de maneira assíncrona
// É capaz de emitir dados (e com essa coleta verificar se faz sentido coletar/reagir a estes dados)
// Flow não precisa de suspend
