package functionstuff

import scala.annotation.tailrec

object Recursion {
  @tailrec
  def printCountUp(value: Int): Unit = {
    println(value)
    printCountUp(value + 1)
//    println("oops")
  }
  def main(args: Array[String]): Unit = {
    printCountUp(1)
  }
}
