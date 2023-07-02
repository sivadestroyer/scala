


object Ground {
    def maxInRange(a: Int, b: Int): Int = {
        def inRange(x: Int): Int = {
            if( x >= 20 && x <= 30 ){
                x;
            }
            else{
                0;
            }
        }

        inRange(Math.max(a, b));
    }

    def main(args: Array[String]) = {
        println(maxInRange(24, 24));
    }
}