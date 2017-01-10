package aggregation

object Fold {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var gg = List(1,2,3,4,5);                       //> gg  : List[Int] = List(1, 2, 3, 4, 5)
  
  var tt = gg.fold(3)(_+_);                       //> tt  : Int = 18
  
}