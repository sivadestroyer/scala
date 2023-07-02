import scala.io.StdIn
object substring{
def main(args: Array[String]){
    println("enter the string")
    var s = StdIn.readLine()
    println("enter the index to find the substring")
    var n = StdIn.readInt()
    var k = StdIn.readInt()
    var i = ""
    for (j <- n to k+1){
            i=i+s(j)
        }
    
    println(i)
}
}