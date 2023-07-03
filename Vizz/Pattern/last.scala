

object Last {
    def last: (List[Int] => Int) = (l) => l match {
        case h::Nil => h
        case h::t => last(t)
        case Nil => -1
    }

  def main(args: Array[String]): Unit = {
    val myList: List[Int] = List(1, 2, 3, 4, 5)
    val lastElement: Int = last(myList)
    println(lastElement) // Output: 5
  }
}

// object Last {
//   def last: List[Int] => Int = (l) => l match {
//     case h :: Nil => h
//     case h :: t => last(t)
//     case Nil => -1
//   }

//   def main(args: Array[String]): Unit = {
//     val myList: List[Int] = List(1, 2, 3, 4, 5)
//     val lastElement: Int = last(myList)
//     println(lastElement) // Output: 5
//   }
// }
