package org.bste.euler

trait Problem {
  val title: String
  val description: String
  val answer: String

  def printResult() = {
    println(title)
    println(description)
    println(s"Anser - $answer\n")
  }
}
