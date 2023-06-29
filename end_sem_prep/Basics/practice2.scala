import scala.io.StdIn     
object obsolute {
    def main(args: Array[String]){
        var i = StdIn.readInt()
        if (i<51){
            println(51-i)
        }
        else{
            println(3*(i-51))
        }
    }
}