object HelloWorld {
def main(args: Array[String]): Unit = {
  val name = "Kelvon"
  val age = 25.5

  println(name + " is " + age + " years old")
  println(s"$name is $age years old")
  println(f"$name%s is $age%f years old")
  /*println(s"Hello \nWorld")
  println(raw"Hello \n world") // Does not support the escaping of literals.
*/
}
}
