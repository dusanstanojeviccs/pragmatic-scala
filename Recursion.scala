import scala.annotation.tailrec

def fact(n: Int): Int = {
  if (n == 1) {
    1
  } else {
    n * fact(n - 1)
  }
}



println(fact(10))



@tailrec
def factTco(prev: BigInt, n: BigInt): BigInt = {
  if (n == 1) {
    prev
  } else {
    factTco(prev * n, n - 1)
  }
}


println(factTco(1, 1000))