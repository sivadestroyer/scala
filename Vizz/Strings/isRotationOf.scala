


object Ground {
    def isRotationOf(str1: String, str2: String): Boolean = {
        (str1 + str1).contains(str2)
    }

    def main(args: Array[String]) = {
        println(isRotationOf("ABACD", "CDABA"));
    }
}