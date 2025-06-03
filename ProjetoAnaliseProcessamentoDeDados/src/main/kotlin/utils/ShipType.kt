package utils

enum class ShipType {
    CARGO, BATTLESHIP, PIRATE
}

/*
Define a enumeração dos tipos de navio permitidos no sistema.

- O seu propósito é centralizar a lista de tipos (CARGO, BATTLESHIP, PIRATE) para que qualquer outro arquivo que precise
saber “que tipo de navio existe” referencie esta única fonte de verdade.
 */