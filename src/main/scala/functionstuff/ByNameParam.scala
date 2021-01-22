package functionstuff

object ByNameParam {
  // "multiple argument lists"
  //  def showIt(x: Int)(y: Int): Unit = println(s"x is ${x}, y is ${y}")
  def showIt(x: Int)(y: => Int): Unit = {
    var count = x
    while (count > 0) {
      y
      count -= 1
    }
  }

  def doIt(x: => Unit): Unit = {
    println("starting doIt")
    x
    x
    println("completed doIt")
  }

  def main(args: Array[String]): Unit = {
    showIt(3)(99)
    showIt(3) {
      println("Hello")
      99
    }
    doIt(println("this is the argument"))
  }
}
