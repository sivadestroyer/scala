

object Ground {

    // common elemenrs in 2 lists
    def foo(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
        var ret: Array[Int] = Array()

        for ( i <- arr2 ) {
            if( arr1.contains(i) ) {
                ret = ret :+ i
            }
        }

        ret
    }

    def main( args: Array[String] ) = {
        val arr1 = Array(1, 2, 3, 4, 5)
        val arr2 = Array(4, 5, 6, 7, 8)

        val result = foo(arr1, arr2);
        println(result.mkString(", "))
    }
}