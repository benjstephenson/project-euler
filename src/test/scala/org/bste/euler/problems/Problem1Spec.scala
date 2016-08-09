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

}
