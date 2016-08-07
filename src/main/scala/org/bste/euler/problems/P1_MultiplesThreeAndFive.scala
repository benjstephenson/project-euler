package org.bste.euler.problems

import org.bste.euler.Problem

class P1_MultiplesThreeAndFive(limit: Int = 1000) extends Problem {

  val title = "Problem 1 - Multiples of 3 and 5"

  val description = """|If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  |The sum of these multiples is 23.
  |Find the sum of all the multiples of 3 or 5 below 1000.
  |""".stripMargin

  val answer = solve().toString

  private def solve() = {
    (0 until limit).filter { x => x % 3 == 0 || x % 5 == 0 }.sum
  }
}
