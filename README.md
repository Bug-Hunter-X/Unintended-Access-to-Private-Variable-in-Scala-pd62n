# Unintended Access to Private Variable in Scala

This example showcases a subtle issue in Scala where, despite a variable being declared `private`, it can still be indirectly accessed through a public getter method. While this doesn't cause a compilation error, it's generally bad practice, violating encapsulation principles.

The `bug.scala` file demonstrates the problem. The `bugSolution.scala` offers a safer way to handle private variables.