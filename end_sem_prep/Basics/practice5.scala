import scala.io.StdIn
object integers {
    def main(args: Array[String]){
        var i = StdIn.readInt()
        var j = StdIn.readInt()
        if (i>=20 && i<=30){
            if ((j>=20 && j<=30)){
                if (i<j){
                    println(j)
                }
                else{
                    println(i)
                }
            }
            else{
                println(i)
            }
        }
        else if (j>=20 && j<=30){
            println(j)

        }
        else {
            println(0)
        }
    }
}