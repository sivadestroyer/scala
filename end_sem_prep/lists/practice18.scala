object dup{
    def main(args: Array[String]){
        var k: List[Int]=List(3,4,5,6,6,7,3,2)
        var j: List[Int]=List()
        for (i<-k){
            if (j.contains(i)){
                println(i)
            }
            else{
                j=j++List(i)
            }
        }
    }
}