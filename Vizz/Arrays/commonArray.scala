

object Ground {

    def containsInArray(e: Int, arr: Array[Int]): Boolean = {
        var ret: Boolean = false

        for( i <- arr ) {
            if( e == i ) {
                ret = true
                ret
            }
        }

        ret
    }

    // common elemenrs in 2 lists
    def foo(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
        var ret: Array[Int] = Array.empty[Int]

        for ( i <- arr2 ) {
            // if( arr1.contains(i) ) {
            //     ret = ret :+ i
            // }
            if( containsInArray(i, arr1) ) {
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