package euler.one

class FilteredFold(identity : Int, isApplicable : Int => Boolean, binaryOperator : (Int, Int) => Int) {

  def operateBetween(start : Int, end : Int) : Int = {
    (start until end).filter(isApplicable(_)).foldLeft(identity)((b, a) => binaryOperator(b, a))
  }

  def operateLessThan(end : Int) : Int = operateBetween(1, end)
}
