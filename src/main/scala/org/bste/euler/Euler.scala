package org.bste.euler

import org.bste.euler.problems._

object Euler extends App {

  Seq(new P1_MultiplesThreeAndFive,
    new P2_EvenFibonacci,
    new P3_LargestPrime
  ) foreach( _.solve )


}
