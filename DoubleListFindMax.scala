val numbers = List(10, 12, 24, 56)

val doubleNumbers = numbers.map(_ * 2)

val largest = doubleNumbers.foldLeft(Int.MinValue) { Math.max }

println(largest)