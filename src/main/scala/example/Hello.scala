package example

@main
def main(args: String*): Unit = {
  val a = List(1, 2, 3).flatMap(e => List(e, e + 1))
  println(a)
  Hello.aa()
}

object Hello extends Greeting {
  def aa(): Unit = {
    val s = List(1, 2, 5, 8).reduce(_ + _)
    println(s)
    println(greeting)
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}

