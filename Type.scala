val name = Some("Dusan")
val secondName = None

println(name.get)
println(secondName.isEmpty)

def isLarge(number: Int) = {
  if (number > 10) {
    Left(10)
  } else {
    Right("Number too large")
  }
}

def process(isLarge: Either[Int, String]) = {
  isLarge match {
    case Left(value) => println(s"Number was ${value}")
    case Right(err) => println(s"The error was ${err}")
  }
}


val regular = isLarge(7)

process(regular)

val large = isLarge(15)

process(large)