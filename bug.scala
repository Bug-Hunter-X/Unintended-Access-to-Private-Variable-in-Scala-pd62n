```scala
class MyClass(val name: String) {
  private var privateVar = 0

  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  def accessPrivateVar(): Int = {
    privateVar
  }
}

object Main extends App {
  val myInstance = new MyClass("My Object")
  println(myInstance.accessPrivateVar()) // Accessing privateVar directly is allowed, but not ideal
  myInstance.updatePrivateVar(10)
  println(myInstance.accessPrivateVar())
}
```