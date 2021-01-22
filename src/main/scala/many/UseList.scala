package many

object UseList {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(names)
    println(names(0)) // still .apply :)
//    names.update(0) = "Frederick" // Lists are IMMUTABLE... (but :)
//    val more = names.prepended("Alice")
//    val more = names.::("Alice")
    val more =  "Sue" :: "Alice" :: names
    println(more)
    val yetMore = "Fred" :: "Albert" :: "William" :: Nil

    println(more.tail.tail.tail)
  }
}
