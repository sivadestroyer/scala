import scala.collection.mutable.HashMap

object Ground {

    def main( args: Array[String] ) = {
        val lst = List(5, 0, 0, 2)

        var map = new HashMap[Int, Int]()

        for( i <- lst ) {
            if( !map.contains(i) ) {
                map.put(i, 1)
            }
            else {
                map(i) += 1
            }
        }

        map = map.filter{ case (_, value) => value == 1 }

        println(map.keys.toList.mkString(", "))
    }
}