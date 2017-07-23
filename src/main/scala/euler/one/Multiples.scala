package euler.one

object Multiples {

  def intersection(divisors: Seq[Int]) : SequenceFilter = new SequenceFilter(i => divisors.forall(i % _ == 0))

  def union(divisors: Seq[Int]) : SequenceFilter = new SequenceFilter(i => divisors.exists(i % _ == 0))

}
