
def getPersonInfo(id : Int) = {
  if (id equals 1)
    ("Dusan", "Stanojevic", 1995)
  else
    ("Dux", "Stanojevic", 1995)
}



val (name, lastName, yearOfBirth) = getPersonInfo(1)

println(s"Name: $name")
println(s"Last Name: $lastName")
println(s"Year of Birth: $yearOfBirth")


println
println

val person = getPersonInfo(2)

println(s"Name: ${person._1}")
println(s"Last Name: ${person._2}")
println(s"Year of Birth: ${person._3}")
