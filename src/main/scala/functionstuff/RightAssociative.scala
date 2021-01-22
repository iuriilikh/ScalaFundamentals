package functionstuff

object RightAssociative {
//  def xxx(s:String):String = "more than " + s
  def +++:(s:String):String = "more than " + s

  def main(args: Array[String]): Unit = {
//    val result = RightAssociative.xxx("this")
//    val result = RightAssociative.+++:("this")
    // infix invocation of a "operator" type method that has : at the
    // right hand end, is right associative
    val result = "this" +++: RightAssociative
    println(result)
  }
}
