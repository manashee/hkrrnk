package main.scala

object FoldLeft extends App {


  println ( sum ( List ( 1,2,3,4,5,6) ))

  def sum ( list : List [ Integer ]) : Integer = {
    list.foldLeft (0) ( (acc , i ) => {acc + i } )
  }

}
