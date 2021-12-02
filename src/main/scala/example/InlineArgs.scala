package example

import example.InlineArgs.func

object InlineArgs {

  def main(args: Array[String]): Unit = {
    func()
    func(1)
    func("aa")
  }

  inline def func(inline myArg: Int | String = 0) =
    inline myArg match
      case i: Int => println("数字")
      case s: String => println("字符串")
}
