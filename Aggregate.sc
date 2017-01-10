package aggregation

object Aggregate {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // def aggregate[B](z: =>B)(seqop: (B, A) => B, combop: (B, B) => B): B = foldLeft(z)(seqop)
  var intList = List(1,2,3,4,5,6);                //> intList  : List[Int] = List(1, 2, 3, 4, 5, 6)
  val maxNum =  intList.aggregate (0)( math .max(_, _), _ + _);
                                                  //> maxNum  : Int = 6
  val  maxNum1 =  intList. aggregate (5) ((x,y) => math .max(x, y), (x,y)=> x + y)
                                                  //> maxNum1  : Int = 6
 val maxNum2 =  intList.aggregate (50)( math .max(_, _), _ + _);
                                                  //> maxNum2  : Int = 50
                                                  
 val k = intList.aggregate(0,0)((x,y)=>(x._1+y,x._2+1),(x,y)=>(x._1+x._2,y._1+y._2))
                                                  //> k  : (Int, Int) = (21,6)
                                      	           
                                       //(x,y)=>(x._1+y,x._2+1)
 																			 //Iteration 1 (0+1 , 0+1) =>(1,1)
 																			 //Iteration 1 (1+2 , 1+1) =>(3,2)
 																			 
 																			 //Iteration 1 (3+3 , 2+1) =>(6,3)
 																			 //Iteration 1 (6+4 , 3+1) =>(10,4)
 																			 
 																			 //Iteration 1 (10+5 , 4+1) =>(15,5)
 																			 //Iteration 1 (15+6 , 5+1) =>(21,6)
 																			 
 																			 //(x._1+x._2,y._1+y._2)
}																					//1