package org.bste.euler.problems

import org.bste.euler.Problem

import scala.annotation.tailrec

class P5_EvenlyDivisible(limit: Int = 20) extends Problem {

  val title = "Problem 5 - Evenly Divisible Numers"

  val description = """|2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    |What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?""".stripMargin

  def answer = solve.toString

  private def solve = {
    val nums = (1 to limit).toList

    @tailrec
    def check(n: Int): Int = {
      val highestDivisor = nums.takeWhile(x => n % x == 0).last
      if (highestDivisor == limit) n else check(n+1)
    }

    check(1)
  }
}
