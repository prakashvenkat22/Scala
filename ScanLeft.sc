package aggregation

object ScanLeft {
 // scanLeft returns a new sequence
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   val a = Array(1, 2, 3)                         //> a  : Array[Int] = Array(1, 2, 3)
   var t = a.scanLeft(13)(_+_);                   //> t  : Array[Int] = Array(13, 14, 16, 19)
   
   var gg1 = List("Hi","Hello","How","are","You");//> gg1  : List[String] = List(Hi, Hello, How, are, You)
    var t2 = gg1.scanLeft("Sir")(_+_);            //> t2  : List[String] = List(Sir, SirHi, SirHiHello, SirHiHelloHow, SirHiHelloH
                                                  //| oware, SirHiHelloHowareYou)
}