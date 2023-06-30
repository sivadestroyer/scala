object palindrome{
    def main(args: Array[String]){
        var listp: List[Int]=List(1,2,1)
        if(listp==listp.reverse){
            println("True")
        }
        else{
            println("False")
        }
    }
}