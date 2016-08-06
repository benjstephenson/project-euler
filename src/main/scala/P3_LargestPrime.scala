package org.bste.euler

object P3_LargestPrime {

  def main(args: Array[String]) = {

    def factors(n: Long): List[Long] = (2 to math.sqrt(n).toInt)
      .find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n / i))

    val r = factors(600851475143L).last

    println(s"res $r")

  }
}
