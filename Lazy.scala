def getName = {
  println("Getting the name")
  "Dusan"
}


lazy val name = getName


println("Here we are")
println(name)


val people = List("Dux", "Dusan", "Duca", "Not Dusan")

println(people.view.filter{p => p.startsWith("D")}.head)

println("---------")






def generate(starting: Int) : Stream[Int] = {
  starting #:: generate(starting + 1)
}


println(generate(10))


println(generate(10).take(20).force)

