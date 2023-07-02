object mymap
{
 
 val lst = List(1,2,3,5,7,10,13);

 def main(args:Array[String])
 {
   println(lst.map(_ * 2));                         //method 1
   println(lst.map(x => x + 3));                //method 2 - using nameless function
   
   println(lst.map(x => "hi"+ x));            //string concatenation
   println(lst.map(x => "hi" * x));           //string multiplication

   println("hello".map(_.toUpper));      //String is a list of characters
 }
}