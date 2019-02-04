package sock

object App {

  // array decl syntax changes
  val arr = Array[Int] ( 10,20,20,10,10,30,50,10,20  )
  println( sockMerchant ( arr.length , arr ) );

  def sockMerchant ( n : Int, arr : Array[Int] ) : Int = {
    arr.map ( e => (e,1)).groupBy(_._1).mapValues( _.map ( _._2 ).sum / 2 ).values.sum
  }
}

