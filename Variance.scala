class Animal(val sound: String) {
  override def toString = sound
}

class Dog(override val sound: String) extends Animal(sound)

class BlackRussianTerrier(override val sound: String) extends Dog(sound)

val dogs = List(new Dog("Av"), new Dog("Bark"))

val blackRussianTerriers = List(new BlackRussianTerrier("Russian Bark"))


def washAnimals[T <: Animal](animals: List[T]) = animals.foreach(println(_))

println("Washing animals")
washAnimals(dogs)


def washDogs[T >: Dog](dogs: List[T]) = dogs.foreach(println(_))

println("Washing dogs")
washDogs(dogs)

println("Washing black russian terriers")
washDogs(blackRussianTerriers)