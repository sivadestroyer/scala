import scala.io.StdIn
object substring{
def main(args: Array[String]){
    println("enter the string")
    var s = StdIn.readLine()
    println("enter the index to find the substring")
    var n = StdIn.readInt()
    var k = StdIn.readInt()
    var i = ""
    for (j <- 0 to s.length){
        if (j>=n && j<= k){
            i=i+s(j)
        }
    }
    println(i)
}
}