object commonstring{
    def main(args: Array[String]){
        var s: Array[String] = Array("hello","world","i","am","kumar")
        var r: Array[String] = Array("hello","world")
        var c: Array[String] = s.intersect(r)
        println(c.mkString(","))
    }
}