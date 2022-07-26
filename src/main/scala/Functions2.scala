object Functions2 {

  object Math {
    //Here we can set out values in out parameters

    //    def add(x:Int = 45 , y: Int = 15): Int = {
    //      x+y;
    //    }
    //    def square(x: Int) = x*x;
    //  }

    //We can use operators as a function name as such:
    def +(x: Int = 45, y: Int = 15): Int = {
      x + y;
    }

    def **(x: Int) = x * x;
  }

  def print(x: Int, y: Int): Unit = {
    println(x + y);
  }

  def main(args: Array[String]): Unit = {
    //we can simply call the add() function here since out values are already set in the function. We can override the parameters by providing them in out function call. If you assign one value in the function call it will set the value of the first parameter.

    //Anonymous function
    var add = (x: Int, y: Int) => x + y;
    println(add(2,100))
    val sum = 10 + 20;
    println(Math.+(60))
    println(Math ** 5);
    println(100, 200)

  }
}
