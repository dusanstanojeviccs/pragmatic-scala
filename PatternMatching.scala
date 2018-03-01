def activity(day: String) {
  day match {
    case "Monday" => println("Work")
    case "Tuesday" => println("Play")
    case "Wednesday" => println("Have fun")
    case "Thursday" => println("Work again")
    case "Friday" => println("Eat")
    case _ => println("Run")
  }
}

val days = List("Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday")

days.foreach(activity(_))

println("-------")







object CellPhoneState extends Enumeration {
  val ON = Value("ON")
  val OFF = Value("OFF")
}

val phoneState = CellPhoneState.ON

phoneState match {
  case CellPhoneState.ON => println("This phone is on")
  case CellPhoneState.OFF => println("This phone is off")
}

println("----------")








case class Person(id: Long, name: String)

def processPerson(data: Any): Unit = {
  data match {
    case (id, name) => println(s"Tuple with id '$id' and name $name")
    case Person(id, name) => println(s"Person with id '$id' and name $name")
  }
}

processPerson(Person(10, "Dusan"))
processPerson(5, "Max")

println("---------")








object PersonWithASmallId {
  def unapply(person: Person): Option[(Long, String)] = {
    if (person.id < 10) {
      Some(person.id, person.name)
    } else {
      None
    }
  }
}

val person = Person(5, "Dux")

person match {
  case PersonWithASmallId(id, name) => println(s"Person '$name' had a small id '$id")
  case _ => println("Person did not have a small id")
}

println("---------")







val idPattern = "(\\d+)".r
val personAsString = "{\"id\": 12, \"name\": \"Dusan\"";

println(idPattern findFirstIn personAsString)
