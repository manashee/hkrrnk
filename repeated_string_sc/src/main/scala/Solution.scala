package main.scala

object Solution extends App {


  println  (repeatedString ( "a",1000000000000L))


  def repeatedString(s: String, n: Long): Long = {
    val ca = countChar(s,'a')
    val timesRepeated = n / s.length()
    val rem = n % s.length()


    if ( 0 == rem ) {
      ca * timesRepeated
    }
    else {
      val sub = s.substring(0,rem.toInt)
      val count = countChar ( sub , 'a')
      ca * timesRepeated + count
      }
  }

  def countChar ( s: String , c: Char ): Integer = {
    s.filter(ch => ch == 'a').length();
  }

  }
