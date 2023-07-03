

object fact {

    def fact: (Int => Int) = (n) => { n match {
        case 0 => 1
        case m => m * fact(m-1)
    } }

    def main(args: Array[String]) = {
        println(fact(10))
    }
}