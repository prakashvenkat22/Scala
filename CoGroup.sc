package aggregation

object CoGroup {
  println("Welcome to the Scala worksheet")
  
  val intList = List(1,2,3,4,5);
  
  val k = intList.map((_, "b"));
  val k1 = intList.map(x=>(x,"b"));
  val c = intList.map ((_, "c"))
 
 
 	val b = intList.flatmap(x=>x+1);

}