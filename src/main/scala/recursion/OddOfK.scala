package recursion

object OddOfK {

  def main(args: Array[String]): Unit = {
    println(odd(2))
    println(odd(3))
  }

  def odd(k: Int): Int = {
    if (k == 1) 1 else odd(k - 1) + 2
  }

}
