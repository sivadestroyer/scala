import scala.io.StdIn


object Ground {
    def main(args: Array[String]) = {
        println("Enter the String")

        val s = StdIn.readLine()

        println("Enter the indecies of the substring (Space seperated)")
        val inp = StdIn.readLine().split(" ")

        val i: Int = inp(0).toInt
        val j: Int = inp(1).toInt

        for ( k <- i to j-1) {
            print(s.charAt(k))
        }
        println("\n")
    }
}