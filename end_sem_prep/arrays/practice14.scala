import scala.io.StdIn
object largest{
def main(args: Array[String]){
    var s = StdIn.readLine()
    var j: Array[Int]=s.split(" ").map(_.toInt)
    println("the array that you entered is "+j.mkString(","))
    if (j.length<=1){
        println("please enter the array with more than 1 integer")
    }
    else {
        println(j.max-j.min)
    }
}
}