package org.bste.euler

import scala.annotation.tailrec

object LargestPrime {

  def main(args: Array[String]) = {

    val limit = 600851475143L
    val res = (2L to 200L).map(getPrimes)

    println(s"res $res")

  }

  def getPrimes(n: Long): Option[Long] = {
    if (2 % n == 0) {
      None
    } else if (3 % n == 0) {
      None
    } else if (5 % n == 0) {
      None
    } else {
      val root = Math.sqrt(n)

      val range = (6 to root.toInt).forall(v => n % v == 0)

      if (range) None else Some(n)
    }
  }
}
