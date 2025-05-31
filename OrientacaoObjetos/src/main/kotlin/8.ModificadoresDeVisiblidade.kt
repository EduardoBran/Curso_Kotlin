class ModificadoresDeVisiblidade {
    protected var str: String = ""

    //Nested - classe interna (classe dentro da outra) - nao tem acesso a str
    private class NestedClass(){
        var id: Int = 0
    }

    //Inner Class - classe interna (classe dentro da outra) - tem acesso a str
    private inner class Inner(){

        fun teste(){
            str
        }
    }
}


fun main() {

}

// Modifiers de visibilidade em Kotlin
//
//public
//
//É o default (quando não se especifica nada).
//
//Visível de qualquer lugar: dentro do mesmo módulo ou de outros módulos (se for parte de uma API).
//
//Pode ser aplicado a classes, funções, propriedades, construtores, parâmetros, etc.
//
//private
//
//Para membros de classe: visível apenas dentro da própria classe (ou do objeto aninhado).
//
//Para declarações de topo (funções/propriedades fora de classe): visível apenas no mesmo arquivo Kotlin.
//
//Impede qualquer acesso externo, reforçando o encapsulamento.
//
//protected
//
//Só vale para membros de classe (não existe “protected” em top-level).
//
//Visível dentro da própria classe e em suas subclasses (mesmo que estejam em arquivos diferentes).
//
//Útil quando você quer expor algo aos herdeiros, mas esconder de código “de fora” que não herda daquela classe.
