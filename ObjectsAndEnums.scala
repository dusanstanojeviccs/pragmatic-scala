import java.util

object Job extends Enumeration {
  type Job = Value
  val PROGRAMMER, INVESTOR = Value
}

import Job._

class Person(val name: String, job: Job)

object Person {
  val people = new util.ArrayList[Person]

  def getPerson(name: String) = {
    people.stream().filter(_.name == name).findAny()
  }

  def createPerson(name: String, job: Job) = {
    val person = new Person(name, job)
    people.add(person)
    person
  }
}


val person = Person createPerson("Dusan", Job.PROGRAMMER)

println(person.name)