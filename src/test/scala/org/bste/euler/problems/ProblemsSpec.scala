package org.bste.euler.problems

import org.scalatest.{FlatSpec, Matchers}

class ProblemsSpec extends FlatSpec with Matchers {

  "Problem 1" should "correctly total" in {
    val problem = new P1_MultiplesThreeAndFive(10)
    problem.answer shouldBe "23"
  }

  "Problem 2" should "sum fibonacci numbers" in {
    val problem = new P2_EvenFibonacci(100)
    problem.answer shouldBe "44"
  }

  "Problem 3" should "get the largest prime factor" in {
    val problem = new P3_LargestPrime(13195)
    problem.answer shouldBe "29"
  }

  "Problem 4" should "find the largest palindrome product" in {
    val problem = new P4_PalindromeProduct(10, 99)
    problem.answer shouldBe "9009"
  }

  "Problem 5" should "find the smallest number divisible by all integer 1 to n" in {
    val problem = new P5_EvenlyDivisible(10)
    problem.answer shouldBe "2520"
  }

  "Problem 6" should "find the difference between sum of squares and square of sum of 1 to n" in {
    val problem = new P6_SumOfSquares(10)
    problem.answer shouldBe "2640"
  }

  "Problem 7" should "find the nth prime number" in {
    val problem = new P7_NthPrime(6)
    problem.answer shouldBe "13"
  }

}
