

object Join {

  def addLists: ((List[Int], List[Int]) => List[Int]) = (a, b) => (a, b) match {
    case (h1 :: t1, h2 :: t2) => (h1 + h2) :: addLists(t1, t2)
    case _ => Nil
  }

  def main(args: Array[String]): Unit = {
    println(addLists(List(5, 0, 0, 2), List(2, 0, 0, 5)).mkString(", "))
  }

}
