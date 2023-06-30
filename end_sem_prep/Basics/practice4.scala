import scala.io.StdIn         
object str{
    def main(args: Array[String])
    {
        var s = StdIn.readLine()
        println("enter which element index should be deleted "+s)
        var d = StdIn.readInt()
        var m = s.patch(d,"",1)
        // the three parameters are first one position and second replace , third how many characters what to be repalced
        println(s"$m is the modified string")
    }
}