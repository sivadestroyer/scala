import scala.collection.mutable.HashMap


object Ground {
    def foo( str: String ) = {
        var count = new HashMap[String, Int]();

        for (c <- str.split(" ") ) {
            if( count.contains(c) ){
                count(c) += 1;
            }
            else {
                count.put(c, 1);
            }
        }

        val dups = count.filter { case (_, value) =>
            value > 1
        }

        dups.keys.toList
    }

    def main(args: Array[String]) = {
        val str = "gum gum no mi";

        println(foo(str));
    }
}