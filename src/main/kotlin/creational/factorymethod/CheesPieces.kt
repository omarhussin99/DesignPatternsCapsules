package creational.factorymethod

/**
 * Represents a pawn on the chessboard.
 *
 * @property file The file (column) of the chessboard where the pawn is located.
 * @property rank The rank (row) of the chessboard where the pawn is located.
 */
data class Pawn(
    override val file: Char,
    override val rank: Char
) : ChessPiece

/**
 * Represents a queen on the chessboard.
 *
 * @property file The file (column) of the chessboard where the queen is located.
 * @property rank The rank (row) of the chessboard where the queen is located.
 */
data class Queen(
    override val file: Char,
    override val rank: Char
) : ChessPiece