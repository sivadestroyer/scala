

object Ground {

    // List is a palindrome
    def foo(lst: List[Int]): Boolean = {
        if (lst.length == 1 || lst.isEmpty)
            true

        else if (lst.head == lst.last)
            foo(lst.tail.dropRight(1))
        
        else
            false
    }

    def main( args: Array[String] ) = {
        val results = foo(List(5, 0, 0, 5))
        println(results)
    }
}