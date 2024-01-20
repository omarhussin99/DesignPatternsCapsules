package creational.factorymethod

import java.lang.RuntimeException

fun main() {
    createPiece("qa3")
}

/**
 * Creates a chess piece based on the given notation.
 *
 * @param notation The notation representing the chess piece.
 * @return A chess piece object based on the provided notation.
 * @throws RuntimeException if the notation represents an unknown piece.
 */
fun createPiece(notation : String) : ChessPiece {
    val (type,file,rank) = notation.toCharArray()
    return when (type) {
        'q' -> Queen(file,rank)
        'p' -> Pawn(file, rank)
        else -> throw RuntimeException("Unknown piece: $type")
    }
}

