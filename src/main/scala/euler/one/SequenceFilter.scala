package euler.one

class SequenceFilter(isApplicable : Int => Boolean) {

  def multiplesBetween(start : Int, end : Int) : Seq[Int] = {
    (start until end).filter(isApplicable(_))
  }

  def multiplesLessThan(end : Int) : Seq[Int] = multiplesBetween(1, end)

}
