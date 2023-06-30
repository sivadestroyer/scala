object remove{
    def main(args: Array[String]){
        var j: List[Int]=List(1,2,3,4,5)
        var even: List[Int]=j.filter(_%2==0)// only gives you even number
        var odd: List[Int]=j.filterNot(_%2==0)
        println(even,odd)
    }
}