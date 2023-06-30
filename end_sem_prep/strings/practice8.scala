// finding the duplicate in the string
import scala.io.StdIn 
object duplicate{
    def main(args: Array[String]){
        var s = StdIn.readLine()
        var l:List[Char]=List()
        var d:List[Char]=List()
        for (k<-s){
            if (l.contains(k)){
                d=d++List(k)
            }
            else {
                l=l++List(k)
            }
        }
        println(s"$d are the duplicates and the count is ${d.length}")
    }
}