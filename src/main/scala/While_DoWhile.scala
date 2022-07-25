object While_DoWhile {
  def main(args: Array[String]): Unit = {
    var x = 0;

    while (x < 10) {
      println("x = " + x);
      x += 1; //x=x+1 x++ is not supported in Scala
    }

    var y = 0;
    do {
      println("y = " + y)
    } while (y < 0);
  }
}
