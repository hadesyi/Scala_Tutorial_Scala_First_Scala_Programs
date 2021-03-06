package `class`

import java.io.BufferedReader

class sec01 {
  def myMethod(): String = "hadeslee.tistory.com"

  def myOtherMethod() = "Moof"

  def foo(a: Int): String = a.toString

  def f2(a: Int, b: Boolean): String = if (b) a.toString else "false"

  def list[T](p: T): List[T]
  = p :: Nil

  list(1)
  list("Hello")

  def largest(as: Int*): Int = as.reduceLeft((a, b) => a max b)

  largest(1)
  largest(2, 3, 99)
  largest(3, 22, 33, 22)

  def mkString[T](as: T*): String = as.foldLeft("")(_ + _.toString)

  def sum[T <: Number](as: T*): Double = as.foldLeft(0d)(_ + _.doubleValue)


  abstract class Base {
    def thing: String
  }
  class One extends Base {
    def thing= "Moof"
  }

  class Two extends One{
    override val thing= (new java.util.Date).toString
  }
  class Three extends One{
    override lazy val thing= super.thing + (new java.util.Date).toString
  }

}
