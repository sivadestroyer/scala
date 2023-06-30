object reverse{
    def main(args: Array[String]){
        var j: Array[Int]= Array(1,2,3,4)
        println(j.reverse.mkString(","))// This is because the default behavior of println is to
        // print the string representation of an object, and arrays in Scala have a default string representation that includes some additional information
    }
}