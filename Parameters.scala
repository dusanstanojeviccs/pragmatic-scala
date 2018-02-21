def findPeople(ids: Int*) = {
  ids.map((_, s"Dusan"))
}

println(findPeople(1, 2))


val ids = Array(10, 20)

println(findPeople(ids : _*))
