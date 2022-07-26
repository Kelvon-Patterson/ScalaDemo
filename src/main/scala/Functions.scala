object Functions {

object Math{
  def add(x:Int , y: Int): Int = {
    x+y;
  }
  def square(x: Int) = x*x;
}

  def add(x: Int, y: Int): Int = {
  return  x + y;
  }

  def subtract(x: Int, y: Int): Int = {
    x - y;
  }

  def multiply(x: Int, y: Int): Int = x * y;


  def divide(x: Int, y: Int)  = x / y;
  //These are four basic different ways to write functions in scala




  def main(args: Array[String]): Unit = {
    println(Math.add(45,15))
    println(Math square 5);

    println(add(45, 15))
    println(subtract(45, 15))
    println(multiply(45, 15))
    println(divide(45, 15))



  }
}
