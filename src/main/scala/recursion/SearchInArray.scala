package recursion

object SearchInArray {
  def main(args: Array[String]): Unit = {
      val input = Array(1,2,4,5,2,4)
      println(search(input, 0, input.length - 1, 4))
  }

  def search(A: Array[Int], i: Int, j: Int, k: Int): Int = {
    if (i <= j) {
      if (A(i) == k) {
        i
      } else {
        search(A, i + 1, j, k)
      }
    } else {
      -1
    }
  }
}
