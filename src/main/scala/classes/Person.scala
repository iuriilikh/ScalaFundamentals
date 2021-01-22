package classes

// this has:
// toString, equals, hashcode
// "match/case" capabilities (extractors)
// and a factory in a compaion object :)
case class Person(name:String, age:Int)

object UsePerson {
  def main(args: Array[String]): Unit = {
    val fred = Person("Fred", 45)
    println(fred)
    val fred2 = Person("Fred", 45)
    println(fred == fred2) // in Scala == delegates to the .equals method
    println(fred.eq(fred2)) // identity comparison

    fred match {
      case Person("Fred", a) => println(s"It's a fred aged ${a}")
    }
  }
}