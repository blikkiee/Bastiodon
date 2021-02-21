package nl.bastiodon.boot

import nl.bastiodon.domain.Board

object Main extends App {
  Board.default.printIt()
}

// t k b q x b k t
// p p p p p p p p
// . . . . . . . .
// . . . . . . . .
// . . . . . . . .
// . . . . . . . .
// p p p p p p p p
// t k b q x b k t

// pawn   p
// rook  t
// knight k
// bishop b
// queen  q
// king   x