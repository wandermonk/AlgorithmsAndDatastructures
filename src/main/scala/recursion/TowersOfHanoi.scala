package recursion

object TowersOfHanoi {

  def main(args: Array[String]): Unit = {
    moveTower(3, "source", "destination", "auxiliary")
  }

  def moveTower(disks: Int, fromTower: String, toTower: String, withTower: String): Unit = {
    if (disks >= 1) {
      moveTower(disks - 1, fromTower, withTower, toTower)
      moveDisks(fromTower, toTower)
      moveTower(disks - 1, withTower, toTower, fromTower)
    }
  }

  def moveDisks(from: String, to: String): Unit = {
    println(s"moving the disk from :: $from to :: $to")
  }

}
