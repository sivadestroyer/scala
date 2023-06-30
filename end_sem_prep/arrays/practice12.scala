object common{
    def main(args: Array[String]){
        var k: Array[Int]= Array(1,2,3,4)
        var m: Array[Int]= Array(5,6,3,5,6,1,3,2)
        var j: Array[Int]= Array()
        for (i<-k){
            if (m.contains(i)){
                j=j++Array(i)
            }
        }
        println(j.mkString(","))
    }
}