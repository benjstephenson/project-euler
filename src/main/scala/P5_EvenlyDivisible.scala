package org.bste.euler

object P5_EvenlyDivisible {

  /* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */

  def main(args: Array[String]) = {
    def divides(x: Int): Boolean = {
      val highestDivisor = (1 to 10).takeWhile(n => x % n == 0).toList

      if (highestDivisor.last == 10) true else false
    }


    println(divides(2521))
  }

}
