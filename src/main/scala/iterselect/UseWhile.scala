package iterselect

object UseWhile {
  def main(args: Array[String]): Unit = {
    var count = 4.0
    while (count > 0) {
      println(f"count is ${count}%6.2f")
      count -= 1
    }
    println("loop finished")
  }
}
