package euler.one

import org.scalatest.FunSuite
import org.scalatest.Matchers._
import org.scalatest._
import Assertions._

class MultiplesTest extends FunSuite {

  test("Either divisor"){
    val multiples : SequenceFilter = Multiples.union(List(3, 5))

    val answer : Seq[Int] = multiples.multiplesLessThan(10)
    answer.foreach(println(_))

    assert(answer.size === 4, "Should contain 3, 5, 6, 9, as these are between 1 (INCLUSIVE) and 10 (EXCLUSIVE) and divide by one of either 3 and 5")
    answer should contain (3)
    answer should contain (5)
    answer should contain (6)
    answer should contain (9)
  }

  test("Both divisors"){
    val multiples : SequenceFilter = Multiples.intersection(List(3, 5))

    val answer : Seq[Int] = multiples.multiplesLessThan(16)
    answer.foreach(println(_))

    assert(answer.size === 1, "Should contain 15, as this is less than 16 and divides by BOTH 3 and 5")
    answer should contain (15)
  }

  test("Sum on either divisor"){
    val filteredFold : FilteredFold = MultipleFolds.sumOnUnionOf(List(3, 5))

    val answer : Int = filteredFold.operateLessThan(10)
    println(answer)

    assert(answer === 23, "3 + 5 + 6 + 9 = 23")
  }

  test("Sum on either divisor, up to 1000"){
    val filteredFold : FilteredFold = MultipleFolds.sumOnUnionOf(List(3, 5))

    val answer : Int = filteredFold.operateLessThan(1000)
    println(answer)

    assert(answer === 233168, "3 + 5 + 6 + 9 + ... (all values that divide by either 3 or 5) ... + 995 + 996 + 999 = 233168")
  }

  test("Product on either divisor,"){
    val filteredFold : FilteredFold = MultipleFolds.productOnUnionOf(List(3, 5))

    val answer : Int = filteredFold.operateLessThan(10)
    println(answer)

    assert(answer === 810, "3 * 5 * 6 * 9 = 810")
  }

}
