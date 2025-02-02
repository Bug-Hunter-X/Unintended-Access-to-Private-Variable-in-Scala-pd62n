```scala
class MyClass(val name: String) {
  private var privateVar: Int = 0

  // Using a method to modify privateVar is more secure
  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  // Removing the direct access to privateVar
  def getPrivateVar(): Int = privateVar
}

object Main extends App {
  val myInstance = new MyClass("My Object")
  println(myInstance.getPrivateVar())
  myInstance.updatePrivateVar(10)
  println(myInstance.getPrivateVar())
}
```