package euler.two

object Fibonacci {

  // Recursion would be doubly exponential
  def lessThan(max : Int) : Long = {
    fibonacci(4000000, 1, 0)
  }

  def fibonacci(max : Int, twoBack : Long, oneBack : Long) : Long = {
    val next : Long = oneBack + twoBack
    if (next < max) fibonacci(max, oneBack, next) else oneBack
  }

  def isFibonacci(value : Long) : Boolean = {
    val check : Long = 5*value*value
    isPerfectSquare(check + 4) || isPerfectSquare(check - 4)
  }

  private def isPerfectSquare(value : Long) : Boolean = {
    val s : Long = math.sqrt(value).toLong
    (s*s).equals(value)
  }


}
