object Example extends App {
  val message: String = "Hello, Scala"
  val message2: Unit = message
  val message3: Unit = {
    val x = 1.0
    Math.acos(x)
  }
//  val message2: String = message
  val message4 = println(message2)
  println(message3)
  println(message4)
}
//object Test extends App {
//  val x = 5
//  val y = {
//    val x = 7
//    x + 3
//  }
//  println(x + "," + y)
//}
//import scala.io.StdIn.readLine
//object Config {
//  val name = "Hello, "
//}
//
//object Main {
//  val prefix = Config.name
//  val name = "Oleg"
//  def greeting(name: String) {
//    val name = readLine()
//    println(prefix + name)
//  }
//}
//def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
//  val pe = (1 / (sigma * Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((x - mu),2)) / (2 * Math.pow(sigma,2)))
//  pe
//}