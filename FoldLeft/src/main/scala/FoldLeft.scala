package main.scala

object FoldLeft extends App {


  println ( sum ( List ( 1,2,3,4,5,6) ))
  println ( concat ( List ( '1','2','3' ) ))
  println ( concat2 ( List ( '1','2','3' ) ))

  // fold left takes 2 curried arguments. second one is an anonymous function that takes 2 arguments.
  // an accumulator and the element in the iteration.
  // the 1st argument is the initial value for the accumulator
  def sum ( list : List [ Integer ]) : Integer = {
    list.foldLeft (0) ( (acc , i ) => {acc + i } )
  }


  def concat ( list : List [Char]): String = {
    list.foldLeft ( "Prefix" ) ( (i, acc) => { acc + i }  )
  }

  def concat2 ( list : List [Char]): String = {
    list.foldRight ( "Prefix" ) ( (i, acc) => {  println ( "acc = " + acc + " i = " + i ); acc + i ;  }  )
  }
}
