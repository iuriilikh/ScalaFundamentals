package many

object ListRecursion {
//  def showAll(l:List[String]):Unit = l match {
//  def showAll[T](l:List[T]):Unit = l match {
//    case Nil =>
//    case h :: t => println(h) ; showAll(t)
//  }

  // Scala's type inferencing works LEFT TO RIGHT in a single argument list
//  def foreach[T](l:List[T], operation: T => Unit):Unit = l match {
  def foreach[T](l:List[T])(implicit operation: T => Unit):Unit = l match {
    case Nil =>
//    case h :: t => operation.apply(h) ; foreach(t, operation)
    case h :: t => operation(h) ; foreach(t)/* picked up as implicit (operation)*/
  }

  def main(args: Array[String]): Unit = {
//    val names: List[String] = List("Fred", "Jim", "Sheila")
    val names = List("Fred", "Jim", "Sheila")
//    foreach(names, (s: String) => println("> " + s))
    foreach(names)((s) => println("> " + s))

    val numbers = List(1, 3, 2.2, 5, 7, 0, "Interesting")
    foreach(numbers)((s) => println("> " + s))
    foreach(numbers)(s => println("> " + s))
    // in principle, use underscore for arguments without
    // an argument list
    // context here confuses is
//    foreach(numbers)(println("> " + _))
  }
}
