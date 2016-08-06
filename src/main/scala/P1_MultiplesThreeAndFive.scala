package org.bste.euler

object P1_MultiplesThreeAndFive {

  /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
  */

  def main(args: Array[String]) {
    val answer = (0 until 1000).filter { x => x % 3 == 0 || x % 5 == 0 }.sum
    println(answer)
  }
}
