object ForLoops {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 5) {
      println("i using to " + i);
    }

    for (i <- 1 until 6) {
      println("i using to " + i);
    }

    var a = 0;
    var b = 0;

    // for loop execution with a range
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }

    val lst = List(1, 2, 3, 4, 5, 6, 99, 54, 7, 8, 9, 10);

    for (i <- lst) {
      println("i using lst" + i)
    }
    //as statement
    for (i <- lst; if i < 6) {
      println("i using filters " + i);

    }
    //as expression
    val result = for {
      i <- lst;
      if i < 6
    } yield {
      i * i


    }
  }
}
