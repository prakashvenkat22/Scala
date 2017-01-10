package aggregation

object ReduceLeft {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var gg = List(1,2,3,4,5);                       //> gg  : List[Int] = List(1, 2, 3, 4, 5)
	var t =   gg.reduceLeft(_+_)              //> t  : Int = 15
	var t1 =   gg.reduceLeft((a,b)=>a+b)      //> t1  : Int = 15
	

	
	  var gg1 = List("Hi","Hello","How","are","You");
                                                  //> gg1  : List[String] = List(Hi, Hello, How, are, You)
  	var t3 =   gg1.reduceLeft(_+_)            //> t3  : String = HiHelloHowareYou
  
  	var t4 = gg1.reduceLeft((a,b)=>if((a.length>b.length)){a}else{b});
                                                  //> t4  : String = Hello
  	var t5 = gg1.reduceLeft((a,b)=>if((a.length<b.length)){a}else{b});
                                                  //> t5  : String = Hi
  
   case class Person(firstName:String,lastName:String);
   
   val personList = Person("Gnana","Prakash") :: Person("MadhanGopi","Jayaraj") ::  Person("Ram","KumarPrasad") :: Person("Ram","Prasad"):: Nil;
                                                  //> personList  : List[aggregation.ReduceLeft.Person] = List(Person(Gnana,Prakas
                                                  //| h), Person(MadhanGopi,Jayaraj), Person(Ram,KumarPrasad), Person(Ram,Prasad))
                                                  //| 
   
   var t9 =  personList.reduceLeft((a,b)=>if(a.firstName.length>b.firstName.length){a}else{b})
                                                  //> t9  : aggregation.ReduceLeft.Person = Person(MadhanGopi,Jayaraj)
    var t91=   t9.firstName;                      //> t91  : String = MadhanGopi
 		var t92=     t9.lastName;         //> t92  : String = Jayaraj
 		   
	 var t10 =  personList.reduceLeft((a,b)=>if(a.lastName.length>b.lastName.length){a}else{b})
                                                  //> t10  : aggregation.ReduceLeft.Person = Person(Ram,KumarPrasad)
	
		val a = Array(1.0, 2.0, 3.0)      //> a  : Array[Double] = Array(1.0, 2.0, 3.0)

  
	 val divide = (x: Double, y: Double) => {
	    val result = x / y
	    println(s"divided $x by $y to yield $result")
	    result
	}                                         //> divide  : (Double, Double) => Double = <function2>
	
	val k = a.reduceLeft(divide)              //> divided 1.0 by 2.0 to yield 0.5
                                                  //| divided 0.5 by 3.0 to yield 0.16666666666666666
                                                  //| k  : Double = 0.16666666666666666
   	val k1 = a.reduce(divide)                 //> divided 1.0 by 2.0 to yield 0.5
                                                  //| divided 0.5 by 3.0 to yield 0.16666666666666666
                                                  //| k1  : Double = 0.16666666666666666
      	val k2 = a.reduce(divide)                 //> divided 1.0 by 2.0 to yield 0.5
                                                  //| divided 0.5 by 3.0 to yield 0.16666666666666666
                                                  //| k2  : Double = 0.16666666666666666
}