package aggregation

object FoldLeft {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //def foldLeft[B](z: B)(f: (B, A) => B): B
  
  var gg = List(1,2,3,4,5);                       //> gg  : List[Int] = List(1, 2, 3, 4, 5)
  var g1 = gg.foldLeft(5)(_+_);                   //> g1  : Int = 20
  
  var g2 = gg.foldLeft(List[Int]())((list,element)=>element::list);
                                                  //> g2  : List[Int] = List(5, 4, 3, 2, 1)
  
  case class Person(name:String,age:Int,sex:String);
  
  var personList =  Person("Ram", 25, "male") ::
             	 			Person("Prakash", 43, "male") ::
              			Person("Ria", 37, "female") ::
              			Nil               //> personList  : List[aggregation.FoldLeft.Person] = List(Person(Ram,25,male), 
                                                  //| Person(Prakash,43,male), Person(Ria,37,female))
              			
var tt =  personList.foldLeft(List[Person]()){
  
  (personList,element)=>
 	 if(element.age>25){
 	   println("Age :: "+element.age)
 	 	 element::personList
 	 }else{
 		 personList;
 	 }
  }                                               //> Age :: 43
                                                  //| Age :: 37
                                                  //| tt  : List[aggregation.FoldLeft.Person] = List(Person(Ria,37,female), Person
                                                  //| (Prakash,43,male))
  
  val stringList = personList.foldLeft(List[String]()) { (stringList,element) =>
  val title = element.sex match {
    case "male" => "Mr."
    case "female" => "Ms."
  }
  //post append
  stringList :+ s"$title ${element.name}, ${element.age}"
}                                                 //> stringList  : List[String] = List(Mr. Ram, 25, Mr. Prakash, 43, Ms. Ria, 37)
                                                  //| 

 var tt2= personList.foldLeft(List[String]()){
 (stringList,element)=>
 
 	val newName = element.sex match {
 		case "male" =>  "mr"
 		case "female" =>  "mrs"
 }
 //preappend
 	s"$newName ${element.name}, ${element.age}" :: stringList
 }                                                //> tt2  : List[String] = List(mrs Ria, 37, mr Prakash, 43, mr Ram, 25)

}