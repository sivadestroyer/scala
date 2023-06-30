import scala.io.StdIn
object sumandproduct{
    def main(args: Array[String]){
        var input = StdIn.readLine()
        var k: List[Int] =input.split(" ").map(_.toInt).toList
        var sum=0
        var pro=1
        for (j <-k){
            sum =sum+j
            pro =pro*j
        }
        println(k,sum,pro)
    }
}