import scala.annotation.tailrec

object  Main extends App {

  println ( sum ( List ( 1,2,3,4,5,6,7,8,9,10) ))

  // tail rec functions have to be called as the last call in the recursive function.
  // the work done in the recursive function should be called as the argument. ( x+acc )
  // for this they need an accumulator argument

  def sum ( l : List [Int])  : Int  = {

    @tailrec
    def sumAcc ( l : List [Int], acc : Int )  : Int  = {
      l match {
        case Nil => acc
        case x :: xs => sumAcc(xs , x  + acc )
      }
    }

    sumAcc(l , 0 )
  }

}
