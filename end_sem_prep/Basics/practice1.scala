import scala.io.StdIn
object hello {
    def main(args: Array[String])
    {
        println("enter the two integer")
        val a = StdIn.readInt()
        val b = StdIn.readInt()
        if (a==b) {
            println(3*(a+b))    
        }
        else {
            println(a+b)
        }
    }
}