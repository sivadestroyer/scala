


object Ground {
    def sumNumbers(str: String): Int = {
        var sum = 0
        var num = 0

        for (i <- str) {
            if (i.isDigit) {
                num += i.asDigit
                num *= 10
            } else {
                if (num != 0) {
                    sum += num / 10
                    num = 0
                }
            }
        }

        sum
    }

    def main(args: Array[String]) = {
        println(sumNumbers("it 15 is25 a 20string"));
    }
}