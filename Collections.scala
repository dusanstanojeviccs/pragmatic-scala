val people = Set("Dusan", "Sasa")
val morePeople = Set("Random Name")

val allPeople = people ++ morePeople

println(s"All people: ${allPeople}")

val coolWebsites = List("medium.com", "duxprogramming.com")

val coolWebsitesValid = coolWebsites.map { "http://" + _ }

println(s"All cool websites ${coolWebsitesValid}")

var animals = Map(
  1 -> (1, "Cow"),
  2 -> (2, "Dog"),
  3 -> (3, "Horse")
)

println(animals(1))
println(s"There are a lot of cool animals: ${animals}")