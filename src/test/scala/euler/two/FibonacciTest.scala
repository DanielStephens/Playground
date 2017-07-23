package euler.two

import org.scalatest.FunSuite

class FibonacciTest extends FunSuite {
  test(""){
    println(Fibonacci.fibonacci(4000000, 0, 1))

    (1 until 10).map(Fibonacci.fibonacci(4000000, 0, 1))
  }
}
