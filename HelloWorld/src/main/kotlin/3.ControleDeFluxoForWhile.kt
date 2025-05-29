fun percorrer(){
    for (i in 1..10){
        print("$i ")
    }
    print("\n")

    for (i in 1..10 step 2){  // pulando
        print("$i ")
    }
    print("\n")

    for (i in 20 downTo 0){ // descendo
        print("$i ")
    }
    print("\n")

    for (i in 1..10){   // break continue
        if (i == 5) {
            break
        }
        print("$i ")
    }

    print("\n")
    val str = "Programação Kotlin"
    for (j in str) {
        print(j)
    }

    print("\n")
    var indice = 0
    while(indice < 10){
        print("$indice ")
        indice++
    }


    print("\n")

    var index = 0
    do {
        print("$index ")
        index++
    } while(index <= 10)
}




fun main() {

    percorrer()
}