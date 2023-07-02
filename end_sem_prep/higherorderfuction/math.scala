object higher2
{
def math(x: Double, y:Double, z:Double, fn: (Double,Double)=>Double): 
Double = fn(fn(x,y),z);      
 def main(args:Array[String])
 {
   val result = math(50,20,10,(x,y)=>x * y);
   println(result);
 }
} 
