//Maps and Flattens the list.
object flatmap
{
 
 val lst = List(1,2,3,5,7,10,13);

 def main(args:Array[String])
 {
  println(lst.flatMap(x=>List(x,x+1)));  
  println(lst.map(x=>List(x,x+1)));
 }

}
