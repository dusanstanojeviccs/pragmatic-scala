
def print3(first: String)(second: String)(third: String): Unit = {
  println(s"${first} ${second} ${third}")
}


print3("10")("20")("30")
print3{"10"}("20")("30")
print3{"10"}{"20"}{"30"}


def fib(num: Int, current: Int = 1, next: Int = 1)(func: Int => Unit) {
  if (num <= current) {
    func(num)
  } else {
    fib(num, next, next + current)(func)
  }
}


fib(9){println(_)}

println("-------")

val fibOfNine = fib(9)

fibOfNine{println}

println("-------")

fibOfNine{ num =>
  if (num % 2 == 0)
    println(num)
}