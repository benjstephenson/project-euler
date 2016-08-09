package org.bste.euler.problems

import org.bste.euler.Problem

class P7_NthPrime(nthPrime: Int = 1001) extends Problem {

  val title = "Problem 7 - Nth Prime"

  val description = """By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
                      |What is the 10 001st prime number?""".stripMargin

  val answer = solve

  private def solve = {

    val start = 2 to 100 toList

    val primes = Seq(2, 3, 5).foldLeft(start) { (primes, divisor) =>
      val nonPrimes = primes.slice(primes.indexOf(divisor) + 1, primes.size).filter(x => x % divisor == 0)
      primes.diff(nonPrimes)
    }

    println(primes)
    primes(nthPrime - 1).toString
  }

}
