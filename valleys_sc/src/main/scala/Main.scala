import scala.annotation.tailrec

object Main extends App {

  def countingValleys(n : Int, s :String ) : Int = {

    @tailrec
    def countValleysAcc ( l : scala.collection.immutable.List [Char] , counter : Int , valleyCount : Int ) : Int = {
      l match {
        case Nil => valleyCount
        case x::xs => if ( x == 'U' ) countValleysAcc(xs , counter + 1 , valleyCount ) else countValleysAcc(xs , counter - 1 , (if ( counter == 0 )  valleyCount + 1  else  valleyCount) )
      }
    }

    countValleysAcc(s.toList, 0 , 0)
  }



  println (  countingValleys(8,"UDDDUDUU") )
}
