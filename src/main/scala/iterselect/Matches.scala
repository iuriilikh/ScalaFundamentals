package iterselect

object Matches {
  def main(args: Array[String]): Unit = {
    val x: Any = 100

    val message = x match {
      // capture with a type is equivalent to:
      // capture, instanceof check, and a cast
      // guard condition (if) does not need parens!??
      case value: Int if value < 100 => s"it's a smallish ${value}"
      case value: Int => s"it's a bigger ${value}"
      //      case 99 => "it's 99!"
      //      case 100 => "it's 100"
      case s: String => s"${s} to you too"
      //      case "Hello" => "Hello to you too"
      case _ => "it's something else"
    }
    println(message)
  }

}
