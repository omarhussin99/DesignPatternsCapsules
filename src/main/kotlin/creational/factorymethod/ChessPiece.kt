package creational.factorymethod

/**
 * Represents a chess piece on the chessboard.
 *
 * @property file The file (column) of the chessboard where the piece is located.
 * @property rank The rank (row) of the chessboard where the piece is located.
 */
interface ChessPiece {
    val file: Char
    val rank: Char
}