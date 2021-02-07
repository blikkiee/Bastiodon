package nl.bastiodon.domain

sealed trait Piece {
  val symbol: String
}

object Piece {
  case class Pawn(colour: Colour) extends Piece {
    override val symbol: String = "p"
  }
  case class Tower(colour: Colour) extends Piece {
    override val symbol: String = "t"
  }
  case class Knight(colour: Colour) extends Piece {
    override val symbol: String = "k"
  }
  case class Bishop(colour: Colour) extends Piece {
    override val symbol: String = "b"
  }
  case class Queen(colour: Colour) extends Piece {
    override val symbol: String = "q"
  }
  case class King(colour: Colour) extends Piece {
    override val symbol: String = "x"
  }
}

sealed trait Colour
case object Black extends Colour
case object White extends Colour

