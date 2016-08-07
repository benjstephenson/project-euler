package org.bste.euler.problems

import org.bste.euler.Problem

class P4_PalindromeProduct(digitSize: Int = 3) extends Problem {

  val title = "Problem 4 - Largest Palendrome Product"

  val description = """|A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
   |numbers is 9009 = 91 × 99.
   |Find the largest palindrome made from the product of two 3-digit numbers.""".stripMargin


  val answer = solve.toString


  private def solve = {

    val nums = (100 to 999).reverse

    val results = nums.flatMap { a =>
      nums.map { b => a * b }
    }.filter(x => x.toString == x.toString.reverse)

    results.max

  }
}
