


object Ground {
    def removeAt(str: String, at: Int): String = {
        var ret = ""
        for (i <- 0 until str.length) {
            if (i != at) {
                ret = ret + str.charAt(i)
            }
        }
        ret
    }

    def main(args: Array[String]) = {
        println(removeAt("012345", 3));
    }
}