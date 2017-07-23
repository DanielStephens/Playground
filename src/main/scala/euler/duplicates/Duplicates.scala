package euler.duplicates

object Duplicates {
  def removeDuplicateRecursive[A](items: List[A]): List[A] = items match {
    case element :: tail => element :: removeDuplicateRecursive(tail.dropWhile(_ == element))
    case Nil => Nil
  }

  def removeDuplicateTailRecursive[A](items: List[A]): List[A] = {
    def compressTail(result: List[A], items: List[A]): List[A] = items match {
      case element :: tail => compressTail(element :: result, tail.dropWhile(_ == element))
      case Nil => result.reverse
    }
    compressTail(Nil, items)
  }
}
