package nl.bastiodon.domain

case class Board(spaces: Map[Space, Piece]){

  def print(): Unit = {
    println("--------------------")
    rows.reverse.foreach(printRow)
    println("--------------------")
    println(" | A B C D E F G H |")
  }

  private val columns = Seq('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
  private val rows = Seq(1, 2, 3, 4, 5, 6, 7, 8)

  private def printRow(row: Int): Unit = {
    val pieces = columns
      .map{ c => spaces.lift(Space(row, c)) }
      .map{ s => s.map(_.symbol) }
      .map{ _.getOrElse(".") }
      .reduce{ (ps, p) => s"$ps $p" }
    println(s"$row| $pieces |")
  }
}

object Board {
  def default(): Board = Board(
    Map(
      Space(1, 'A') -> Piece.Tower(White),
      Space(1, 'B') -> Piece.Knight(White),
      Space(1, 'C') -> Piece.Bishop(White),
      Space(1, 'D') -> Piece.Queen(White),
      Space(1, 'E') -> Piece.King(White),
      Space(1, 'F') -> Piece.Bishop(White),
      Space(1, 'G') -> Piece.Knight(White),
      Space(1, 'H') -> Piece.Tower(White),

      Space(2, 'A') -> Piece.Pawn(White),
      Space(2, 'B') -> Piece.Pawn(White),
      Space(2, 'C') -> Piece.Pawn(White),
      Space(2, 'D') -> Piece.Pawn(White),
      Space(2, 'E') -> Piece.Pawn(White),
      Space(2, 'F') -> Piece.Pawn(White),
      Space(2, 'G') -> Piece.Pawn(White),
      Space(2, 'H') -> Piece.Pawn(White),

      Space(7, 'A') -> Piece.Pawn(Black),
      Space(7, 'B') -> Piece.Pawn(Black),
      Space(7, 'C') -> Piece.Pawn(Black),
      Space(7, 'D') -> Piece.Pawn(Black),
      Space(7, 'E') -> Piece.Pawn(Black),
      Space(7, 'F') -> Piece.Pawn(Black),
      Space(7, 'G') -> Piece.Pawn(Black),
      Space(7, 'H') -> Piece.Pawn(Black),

      Space(8, 'A') -> Piece.Tower(Black),
      Space(8, 'B') -> Piece.Knight(Black),
      Space(8, 'C') -> Piece.Bishop(Black),
      Space(8, 'D') -> Piece.Queen(Black),
      Space(8, 'E') -> Piece.King(Black),
      Space(8, 'F') -> Piece.Bishop(Black),
      Space(8, 'G') -> Piece.Knight(Black),
      Space(8, 'H') -> Piece.Tower(Black),
    )
  )
}

case class Space(
  row: Int,
  column: Char
)