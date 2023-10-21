//println("Hello\nWorld")
//
//123 * 23
//('A'.toInt *10).toChar
//
//'K' - 'A'
//"234534".toInt * 2
//val x = 1.0
//import scala.math.BigDecimal.RoundingMode.HALF_UP
//val weigh = 90.0
//val potatoWaterRatio = 0.9
//val crispsWaterRatio = 0.1
//import scala.math.BigDecimal.RoundingMode.HALF_UP
//
//def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
//  def crispsWeight: BigDecimal = (weight - (potatoWaterRatio * weight) / crispsWaterRatio)
//  return crispsWeight.setScale(5, HALF_UP)
//}
//
//import scala.io.StdIn
//val a = 567890
//val b = a.toBinaryString
//  println(b.apply(2))
//
//val a = 567890
//val bs = a.toBinaryString.toList.map(_.toString.toInt).filter(_ == 1).sum
//
//val s1 = "foo"
//val s2 = "foo"
//println(s1==s2)
//
//val s3 = "bar"
//val s1 = "foo" + s3
//val s2 = "foo" + s3
//println(s1 eq s2)
//
//val s1 = "foo"
//val s2 = "foo"
//println(s1 eq s2)
//
//val s3 = "bar"
//val s1 = "foo" + s3
//val s2 = "foo" + s3
//val s4 = 1
//println(s1(s4).toUpper == s1(s4))
//
//val word = "Hw": String
//val pos = 1: Int
//val check = word(pos).isUpper

//val s = BigInt(2).pow(10000).toString()
////s.contains("777")
//
//val reg = "(.)\\1\\1\\1\\1".r
//
//reg.findFirstIn(s)
//
//val s = " 10 2 3"
//val st = s.split(" ")
//s.startsWith("_")

//def sumEven(n:Int): Long = {
//  def go(i: Int, acc: Long): Long =
//    if(i > n) acc
//    else go(i + 2, acc + i)
//    go(2, acc = 0)
//
//}
//sumEven(100)
//sumEven(1000000000)


def fibs(num: Int) = {
  var fibs_num: List[Int] = List(0, 1)
  var acc = 3
  if (num == 1) {
    fibs_num = fibs_num ++ List(1)
    println(1)
    acc == 2
  }
  else if (num == 2) {
    fibs_num = fibs_num ++ List(1,2)
    acc == 3
    println(1)
  }
    else while (num < acc){
      fibs_num = fibs_num ++ List(fibs_num(acc) + fibs_num(acc - 1))
      println(fibs_num)
  }}