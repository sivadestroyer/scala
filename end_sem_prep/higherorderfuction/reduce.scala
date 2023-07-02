object myreduce
{
 
 val lst = List(1,2,3,5,7,10,13);
 val lst2 = List("A","B","C");
 def main(args:Array[String])
 {
    println(lst.reduceLeft(_+_));  //adds all the elements of lst     
    println(lst.reduceLeft((x,y)=>{println(x + "," + y);x+y;}))      
    println(lst2.reduceLeft(_+_));  //concatenates lst2
    println(lst.reduceRight(_+_));  //adds all the elements of lst
    println(lst.reduceLeft(_-_));  //subtract using reduceRight
    println(lst.reduceRight(_-_)); //subtract using reduceRight
    println(lst.reduceLeft((x,y)=>{println(x + "," + y);x-y;}))
    println(lst.reduceRight((x,y)=>{println(x + "," + y);x-y;}))
 }
}