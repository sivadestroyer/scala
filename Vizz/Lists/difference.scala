

object Ground {

    // Diffrerence between 2 lists
    def foo(lst1: List[Int], lst2: List[Int]): Array[Int] = {
        var ret = Array()

        for( i <- lst1 ) {
            if( !lst2.contains(i) ) {
                ret = ret :+ i
            }
        }

        ret
    }

    def main( args: Array[String] ) = {
        val lst = List(5, 0, 0, 2)
        val lst2 = List(5, 2)

        val results = foo(lst, lst2)
        println(results.mkString(", "))
    }
}