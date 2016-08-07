package org.bste.euler.problems

import org.bste.euler.Problem

class P3_LargestPrime(limit: Long = 600851475143L) extends Problem {

  val title = "Problem 3 - Largest Prime Factor"

  val description = """|The prime factors of 13195 are 5, 7, 13 and 29.
    |What is the largest prime factor of the number 600851475143?""".stripMargin


  val answer = solve().toString

  private def solve() = {
    def factors(n: Long): List[Long] = (2 to math.sqrt(n).toInt)
      .find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n / i))

    factors(limit).last
  }
}
