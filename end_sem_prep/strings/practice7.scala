object check{
    def main(args: Array[String]): Unit = {
        var s = "abacd"
        var k = "daba"
        var check = isrotate(s,k)
        println(check)

        }
        def isrotate(s:String,k:String):Boolean={
            val c = s+k
            if (s.length != k.length){
                false
            } else {
                c.contains(k)
            }
        }
    }
