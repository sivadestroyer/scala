

object Ground {

    def foo(arr: Array[Int]): Array[Int] = {
        var ret: Array[Int] = new Array[Int](arr.length)

        var i: Int = arr.length - 1
        var p: Int = 0
        while( i >= 0 ){
            ret(p) = arr(i)
            i -= 1
            p += 1
        }

        ret
    }

    def main(args: Array[String]) = {
        var arr: Array[Int] = Array(5, 0, 0, 2);

        val results: Array[Int] = foo(arr)
        println(results.mkString(", "))
    }
}