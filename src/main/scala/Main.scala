import scala.io.StdIn.readLine
import scala.util.matching.Regex
//object Main extends App {
//  val x = Math.pow(2,3)
//  println(x)
//  }

//}
//import scala.io.StdIn.readInt
//object Main2 {
//  def main(args: Array[String]): Unit = {
//    val FirstNum = readInt()
//    val SecondNum = readInt()
//    val Sum: Int = FirstNum - SecondNum
//    print(Sum)
//  }
//}
//
//import scala.io.StdIn.readInt
//object Main3 extends App {
//        val FirstNum = readInt()
//        val SecondNum = readInt()
//        val ThirdNum = readInt()
//        val Sum: Int = FirstNum * SecondNum * ThirdNum
//        print(Sum)
//}

//import scala.io.StdIn.readLine
//object Config {
//  val name = "Hello, "
//}
////object Example extends App {
//  import Config.{name => prefix}
//  def name = "Oleg"
//  def greeting(name: String){
//    println(prefix + name)
//  }
//}
//import scala.math.BigDecimal
//import scala.io.StdIn.readInt
//object Main {
//  def main(args: Array[String]) {
//    val a = readInt().toBinaryString.toList.map(_.toString.toInt).filter(_ == 1).sum
//      println(a)
//      }
//    }

//val word = "12": String
//val pos = 1: Int
//object Main {
//  def isCapital(word: String, pos: Int): Boolean = {
//    val check = word(pos) == word(pos).toUpper
//      check
//  }
//}

import scala.io.StdIn.readLine

//object Main {
//  def main(args: Array[String]) {
//    val str1 = readLine().split(" ")
//    val startIndex = str1(0).toInt
//    val endIndex = str1(1).toInt
//    var str = readLine()
//    val newPart = str.slice(startIndex, endIndex + 1).reverse
//    str = str.slice(0, startIndex) + newPart + str.slice(endIndex + 1, str.length + 1)
//    println(str)
//  }
//}


import scala.io.StdIn.readLine

//object Main {
//  def main(args: Array[String]) {
//    var str = readLine().toString
//    val regex = "(([a-z]+)([_]))*([a-z]+)".r
//    if (!str.startsWith("_") && !str.endsWith("_") && !str.contains("__") && !str.replace("_", "d").toString.forall(Character.isDigit)) {
//      str = str.replace("_", "d"): String
//      if (str.forall(Character.isLowerCase)) {
//        println(true)
//      }
//      //      for (i <- 0 >= str.length) {
//      //        if ((Character.isLetter(str.charAt(i)))) {
//      //          println("+")
//      //        }
//      //      }
//      else {
//        println(false)
//      }
//    }
//    else {
//      println(false)
//    }
//  }
//}
import scala.io.StdIn.readInt

object Main{
  val num = readInt()
  def main(args: Array[String]) {
    def fibs(num: Int) = {
      var fibs_num: List[Int] = List(0, 1)
      var acc = 3
      if ((num == 1) || (num == 0)) {
        println(1)
        acc == 2
      }
      else if (num == 3) {
        fibs_num = fibs_num ++ List(1, 2)
        acc == 3
        println(2)
      }
      else while (num < acc) {
        fibs_num = fibs_num ++ List(fibs_num(acc) + fibs_num(acc - 1))
        println(fibs_num)
      }
    fibs_num
    }
  fibs(num = readInt())
  }
}
