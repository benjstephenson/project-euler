package org.bste.euler.problems

import scala.annotation.tailrec

object P5_EvenlyDivisible {

  /* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */

  def main(args: Array[String]) = {

    val result = check(1)

    println(result)
  }

  def divides(x: Int): Boolean = {
    val highestDivisor = (1 to 20).takeWhile(n => x % n == 0).toList

    if (highestDivisor.last == 20) true else false
  }

  @tailrec
  def check(n: Int): Int = {
    if (divides(n)) n else check(n+1)
  }

}
