trait MakesSound {
  def makeSound = println("Making a sound")
}

trait Walks {
  def walk = println("Walking")
}

class HasName(val name: String) {
  def printName = println(name)
}

class Person(override val name: String) extends HasName(name) with MakesSound with Walks {}

class Dog extends Walks {}


val dog = new Dog with MakesSound
val person = new Person("Dusan")


println("Dog:")
dog.makeSound
dog.walk

println("")
println("")

println("Person:")
person.makeSound
person.printName
person.walk