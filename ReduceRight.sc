package aggregation

object ReduceRight {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
   var gg = List(1,2,3,4,5);                      //> gg  : List[Int] = List(1, 2, 3, 4, 5)
   	var t1 =   gg.reduceRight((a,b)=>a*b)     //> t1  : Int = 120
		var t2 =   gg.reduceRight(_+_)    //> t2  : Int = 15
		
  var gg1 = List("Hi","Hello","How","are","You"); //> gg1  : List[String] = List(Hi, Hello, How, are, You)
  var t3 =   gg1.reduceRight(_+_)                 //> t3  : String = HiHelloHowareYou
  

	val a = Array(1.0, 2.0, 3.0)              //> a  : Array[Double] = Array(1.0, 2.0, 3.0)

  
 val divide = (x: Double, y: Double) => {
    val result = x / y
    println(s"divided $x by $y to yield $result")
    result
}                                                 //> divide  : (Double, Double) => Double = <function2>
	
	val k = a.reduceRight(divide)             //> divided 2.0 by 3.0 to yield 0.6666666666666666
                                                  //| divided 1.0 by 0.6666666666666666 to yield 1.5
                                                  //| k  : Double = 1.5
         	val k1 = a.reduce(divide)         //> divided 1.0 by 2.0 to yield 0.5
                                                  //| divided 0.5 by 3.0 to yield 0.16666666666666666
                                                  //| k1  : Double = 0.16666666666666666
}