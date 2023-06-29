import scala.io.StdIn
object check {
    def main(args: Array[String]){
        var a =StdIn.readInt()
        var b =StdIn.readInt()
        if (a==30 || b==30 || a+b==30){
            println("True")
        }
        else {
            println("False")
        }
    }
}