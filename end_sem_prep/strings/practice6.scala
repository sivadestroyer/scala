object sumof{
    def main(args: Array[String]): Unit={
        val strings="helo8 iam 20"
        val m = find(strings)
        val sum = m.sum
        println(sum)
    }
    def find(strings: String): Array[Int] ={
        val k = """\d+""".r
        k.findAllIn(strings).toArray.map(_.toInt)
    }
}