package hello

// sbt: "runMain hello.Hello"
// must be fully qualified

// "public" is NOT a word in Scala
// default access is actually "public-like"
object Hello {
  // Literal value for the Unit type is ()
  // RHS of function decl is an expression, but that can be in {}
  def main(args:Array[String]):Unit = {
    println("Hello World!")

    println(Bonjour)

    var x: Int = 99
//    var x: Int // uninitialized is not permitted
//    val x = 99 // immutable value
//    x = x + 10 // "all the usual operator" + - * / %
    x += 10
//    x++ // no ++ --
    println(x)
     println(2 + 1) // infix notation -- "gatling" domain specific language
     println((2).+(1))  // normal "object method invocation"
  }
}

object Bonjour