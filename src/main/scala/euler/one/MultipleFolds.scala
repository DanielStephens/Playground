package euler.one

object MultipleFolds {

  def sumOnUnionOf(divisors: Seq[Int]) : FilteredFold = new FilteredFold(0, i => divisors.exists(i % _ == 0), (a, b) => a+b)

  def productOnUnionOf(divisors: Seq[Int]) : FilteredFold = new FilteredFold(1, i => divisors.exists(i % _ == 0), (a, b) => a*b)

}
