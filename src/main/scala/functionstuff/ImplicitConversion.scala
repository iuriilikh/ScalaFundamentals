package functionstuff

object ImplicitConversion {
  def showIt(s: String): Unit = println("> " + s)

  implicit def asString(i: Int): String = i.toString

  def main(args: Array[String]): Unit = {
    showIt("Hello")
    showIt(99)
    // want
    // banana.operation(int)
    // have int.operation(int)
    // if you have implicit class Banana(i: Int)
    // then magic occurs
  }
}
