package many

object UseArray {
  def main(args: Array[String]): Unit = {
//    val names = Array.apply("Fred", "Jim", "Sheila")
    val names = Array("Fred", "Jim", "Sheila")

//    println(names.apply(1))
    // apply methods are special
    println(names(1)) // equivalent generated code to above with apply...
//    names(0) = "Frederick"
    names.update(0, "Frederick")
    println(names(0))

    // Java arrays are mutable, but of fixed length...
  }
}
