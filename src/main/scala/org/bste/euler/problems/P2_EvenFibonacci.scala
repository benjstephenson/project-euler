package org.bste.euler.problems

import org.bste.euler.Problem

class P2_EvenFibonacci(limit: BigInt = 4000000) extends Problem {

  val title = "Problem 2 - Sum of Even Fibonacci Numbers"

  val description = """|Each new term in the Fibonacci sequence is generated by adding the previous two terms.
  |By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  |By considering the terms in the Fibonacci sequence whose values do not exceed four million,
  |find the sum of the even-valued terms.""".stripMargin

  val answer = solve().toString

  private def solve() = {
    lazy val fibStream: Stream[Int] = 1 #:: fibStream.scanLeft(1)(_ + _)

    val sum = fibStream.takeWhile(_ < limit).tail.foldLeft(0: BigInt) { (acc, value) =>
      if (value % 2 == 0) acc + value else acc
    }

    sum
  }

}
