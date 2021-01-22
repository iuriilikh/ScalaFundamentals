package classes

import classes.Date.daysInMonth

object Date {
  // companions get privileged access to each other's private elements
  def apply(day: Int, month: Int, year: Int): Date = new Date(day, month, year)
  def dayOfWeek(day: Int, month: Int, year: Int): Int = {
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

  def isLeap(year: Int): Boolean =
    (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)

  def daysInMonth(month: Int, year: Int): Int = month match {
    case 9 | 4 | 7 | 11 => 30
    case 2 => if (isLeap(year)) 29 else 28
    case _ => 31
  }
}

//class Date(day:Int, month: Int, year: Int) {
// create mutable fields
//class Date(var day:Int, var month: Int, var year: Int) {
// creates non-modifiable fields
class Date protected(val day:Int, val month: Int, val year: Int) {
  if (day > 0 && day <= daysInMonth(month, year) && month > 0 && month < 13)
  println(s"Making a date ${day}, ${month}, ${year}")
//  val d = day

//  def asText:String = s"Date day = ${day}, month = ${month}, year = ${year}"
  override def toString:String = s"Date day = ${day}, month = ${month}, year = ${year}"

  def this(d: Int, m: Int) = this(d, m, 2021) // auxiliary constructor
}

class Holiday(day: Int, month: Int, year: Int, val name:String)
  extends Date(day, month, year) {
  override def toString: String = super.toString + " which is a holiday called " + name
}

object TryDates {
  def main(args: Array[String]): Unit = {
//    val today = new Date(22, 1, 2021)
    val today = Date(22, 1, 2021)
//    println(today.asText)
    println(today)
    val janOne: Date = new Holiday(1, 1, 2021, "New year's day")
    println(janOne)

    println(new Date(12, 12))
  }
}