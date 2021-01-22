package iterselect

object Conditions {
  def main(args: Array[String]): Unit = {
    val x = true
    // if else is an EXPRESSION equivalent to ? : in other C like languages
    val message = if (x) {
      "It's true"
    } else {
      "It's false"
    }
    println(message)

//    val message = if (x) {
//      println("It's true")
//    } else {
//      println("It's false")
//    }
//    println(message) // Unit () is real! everything is an expression

//    if (x) {
//      println("It's true")
//    } else {
//      println("It's false")
//    }

    // blocks ARE EXPRESSIONS!!!
    val y = {
      println("Calculating...")
      99
    } // the value of the expression that is a block is
      // the value of the last expression in that block
  }
}
