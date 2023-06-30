import scala.io.StdIn
object finding{
    def main(args: Array[String]){
        var s = StdIn.readLine()
        var d: Array[Int]=s.split(" ").map(_.toInt)
        var k=Int.MaxValue
        var pair = (0,0)
        for(i <- 0 until d.length-1){
            for(j<- i+1 until d.length){
            var sum = d(i)+d(j)
            if (Math.abs(sum)<math.abs(k)){
                k=sum
                pair = (d(i),d(j))
            }
            }
        }
        println(k,pair)
        
}
}