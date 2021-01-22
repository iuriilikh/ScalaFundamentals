package functionstuff

import java.sql.SQLException
import scala.util.{Failure, Success, Try}

object FunctDecls {


  def hello2:String = "AnotherHello"

  def hello():String = "Hello"

  // Zeller's congruence
  def dayOfWeek(day: Int, month: Int, year: Int): Int = {
//    val m = if (month < 3) month + 12 else month
//    val y = if (month < 3) year - 1 else year

//    val tup = if (month < 3) (month + 12, year - 1) else (month, year)
//    println(s"m-value is ${tup._1}, y-value is ${tup._2}")

    val (m, y) = if (month < 3) (month + 12, year - 1) else (month, year)
    (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7
  }

  def dayName(d:Int = 0):String = d match {
    case 0 => "Saturday"
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tuesday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
  }

  def main(args: Array[String]): Unit = {
    println(dayName(3))
    println(dayName())
//    println(dayName)
    println(hello())
    println(hello)
    println(hello2) // this looks like a field access, MUST NOT have parens

    println(s"Day of week of new years day 2000 ${dayName(dayOfWeek(1, 1, 2000))}")
    // pass by name parameters
    println(s"Today is ${dayName(dayOfWeek(day = 1, month = 22, year = 2021))}")

    try {
      // Math.random() is a Java feature
      // math.random() is a Scala feature
      if (math.random() > 0.5) throw new SQLException // Scala does not have "checked exceptions"
      println(s"Day number -1 is ${dayName(-1)}")
    } catch {
      case t: SQLException => println("uh oh, db offline!")
      case t: MatchError => println(s"That broke ${t.getMessage}")
    } finally {
      println("still going")
    }
    println("Out of the try structure")

//    Try, has two subtypes, Success and Failure
    Try {
      if (math.random() > 0.5) throw new SQLException
      else 99
    } match {
      case Success(v) => println(s"Value is ${v}")
      case Failure(t) => println("that broke")
    }
  }
}
