object difflist{
    def main(args: Array[String]){
        var s1: List[Int]= List(1,2,3,4,5,6)
        var s2: List[Int]=List(2,3,4,5)
        var inter: List[Int]=List()
        for (j<-s1){
            if(s2.contains(j)){

            }
            else {
                inter=inter++List(j)
            }
        }
        print(inter)
    }
}