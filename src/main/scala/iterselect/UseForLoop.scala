package iterselect

object UseForLoop {
  def main(args: Array[String]): Unit = {
    val range = Range(1, 10)
    val many = for {
      x <- range
      y = x * 2
      if y < 6
      z <- Range(0, y)
    } yield z
    println(many)
  }
}
