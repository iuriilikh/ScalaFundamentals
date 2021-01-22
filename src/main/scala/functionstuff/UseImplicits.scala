package functionstuff

object MyMessageLibrary {
  def showMessage(implicit s:String): Unit = println(s"The message is ${s}")
  implicit val english: String = "Hello"
  implicit val french: String = "Bonjour"
}

object UseImplicits {
//  def showMessage(s:String = "Bonjour"): Unit = println(s"The message is ${s}")

  def main(args: Array[String]): Unit = {
//    showMessage("Hello")
//    showMessage()
    MyMessageLibrary.showMessage("Hello")

    {
      import MyMessageLibrary.french
//      implicit val mymsg: String = "Bonjour"
      MyMessageLibrary.showMessage
      MyMessageLibrary.showMessage
    }

    {
      import MyMessageLibrary.english
//      implicit val myOtherMsg: String = "Guten Tag"
      MyMessageLibrary.showMessage
    }
  }
}
