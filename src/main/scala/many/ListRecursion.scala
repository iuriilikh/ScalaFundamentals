package many

object ListRecursion {
//  def showAll(l:List[String]):Unit = l match {
  def showAll[T](l:List[T]):Unit = l match {
    case Nil =>
    case h :: t => println(h) ; showAll(t)
  }
  def main(args: Array[String]): Unit = {
//    val names: List[String] = List("Fred", "Jim", "Sheila")
    val names = List("Fred", "Jim", "Sheila")
    showAll(names)

    val numbers = List(1, 3, 2.2, 5, 7, 0)
    showAll(numbers)
  }
}
