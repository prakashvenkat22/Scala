package aggregation

object FoldRight {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   println("Welcome to the Scala worksheet")      //> Welcome to the Scala worksheet
  
  //foldRight[B](z: B)(op: (A, B) => B): B
  
  var gg = List(1,2,3,4,5);                       //> gg  : List[Int] = List(1, 2, 3, 4, 5)
  var g1 = gg.foldRight(5)(_+_);                  //> g1  : Int = 20
  
  //pre append
  var g2 = gg.foldRight(List[Int]())((element,list)=>element::list);
                                                  //> g2  : List[Int] = List(1, 2, 3, 4, 5)
  //post append
  var g3 = gg.foldRight(List[Int]())((element,list)=>list:+element);
                                                  //> g3  : List[Int] = List(5, 4, 3, 2, 1)
  
                                                  
  
  case class Person(name:String,age:Int,sex:String);
  
  var personList =  Person("Ram", 25, "male") ::
             	 			Person("Prakash", 43, "male") ::
              			Person("Ria", 37, "female") ::
              			Nil               //> personList  : List[aggregation.FoldRight.Person] = List(Person(Ram,25,male),
                                                  //|  Person(Prakash,43,male), Person(Ria,37,female))
              			
var tt =  personList.foldRight(List[Person]()){
  
  (element,personList)=>
 	 if(element.age>25){
 	   println("Age :: "+element.age)
 	 	 element::personList
 	 }else{
 		 personList;
 	 }
  }                                               //> Age :: 37
                                                  //| Age :: 43
                                                  //| tt  : List[aggregation.FoldRight.Person] = List(Person(Prakash,43,male), Per
                                                  //| son(Ria,37,female))
  
  val stringList = personList.foldRight(List[String]()) { (element,personList) =>
  val title = element.sex match {
    case "male" => "Mr."
    case "female" => "Ms."
  }
  //post append
  personList :+ s"$title ${element.name}, ${element.age}"
}                                                 //> stringList  : List[String] = List(Ms. Ria, 37, Mr. Prakash, 43, Mr. Ram, 25
                                                  //| )

 var tt2= personList.foldRight(List[String]()){
 (element,personList)=>
 
 	val newName = element.sex match {
 		case "male" =>  "mr"
 		case "female" =>  "mrs"
 }
 //preappend
 	s"$newName ${element.name}, ${element.age}" :: stringList
 }                                                //> tt2  : List[String] = List(mr Ram, 25, Ms. Ria, 37, Mr. Prakash, 43, Mr. Ra
                                                  //| m, 25)
}