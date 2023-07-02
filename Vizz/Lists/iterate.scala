

object Ground {

    def main( args: Array[String] ) = {
        val lst = List(5, 0, 0, 2)
        var sum = 0
        var prod = 1

        for( i <- lst ) {
            println(i);
            sum += i
            prod *= i
        }

        println(s"Sum of the list = $sum")
        println(s"Product of the list = $prod")
    }
}