package org.bste.euler

object EvenFibonacci {

  /*Each new term in the Fibonacci sequence is generated by adding the previous two terms.
   * By starting with 1 and 2, the first 10 terms will be:
   * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
   * find the sum of the even-valued terms.
   */

  def main(args: Array[String]) = {

    lazy val fibStream: Stream[Int] = 1 #:: fibStream.scanLeft(1)(_ + _)

    val sum = fibStream.takeWhile(_ < 4000000).tail.foldLeft(0: BigInt) { (acc, value) =>
      value match {
        case x if x % 2 == 0 => acc + x
        case _ => acc
      }
    }

    println(s"total : $sum")
  }

}
