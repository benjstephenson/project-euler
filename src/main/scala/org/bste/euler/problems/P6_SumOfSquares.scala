package org.bste.euler.problems

import org.bste.euler.Problem

class P6_SumOfSquares(limit: Int = 100) extends Problem {

  val title = "Problem 6 - Difference between the sum of the squares and the square of the sum"

  val description = """|The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
  |The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
  |Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
  |is 3025 − 385 = 2640.
  |Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.""".stripMargin

  def answer = solve.toString


  private def solve = {
    val range = 1 to limit
    val sumOfSquares = range.map(x => scala.math.pow(x, 2)).sum
    val squareOfSum = scala.math.pow(range.sum, 2)

    (squareOfSum - sumOfSquares).toLong
  }
}
