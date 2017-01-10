package aggregation

object ScanRight {
   println("Welcome to the Scala worksheet")      //> Welcome to the Scala worksheet
   val a = Array(1, 2, 3)                         //> a  : Array[Int] = Array(1, 2, 3)
   var t = a.scanRight(13)(_+_);                  //> t  : Array[Int] = Array(19, 18, 16, 13)
   
   var gg1 = List("Hi","Hello","How","are","You");//> gg1  : List[String] = List(Hi, Hello, How, are, You)
    var t2 = gg1.scanRight("Sir")(_+_);           //> t2  : List[String] = List(HiHelloHowareYouSir, HelloHowareYouSir, HowareYouS
                                                  //| ir, areYouSir, YouSir, Sir)
}