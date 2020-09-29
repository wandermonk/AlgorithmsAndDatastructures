package recursion

object TwoPowerK {

  def main(args: Array[String]): Unit = {
      println(twoPowK(2))
  }

  def twoPowK(k: Int): Double = {
    if (k == 0) 1 else 2 * twoPowK(k - 1)
  }

}
