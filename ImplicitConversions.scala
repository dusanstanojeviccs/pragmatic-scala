import java.time.LocalDate
import scala.language.implicitConversions
// Great for DSL

class DateHelper(offset: Int) {
  def days(when: String) = {
    val today = LocalDate.now
    when match {
      case "ago" => today.minusDays(offset)
      case "from now" => today.plusDays(offset)
      case _ => today
    }
  }
}


object DateHelper {
  implicit def convertInt2DateHelper(offset: Int) = new DateHelper(offset)

  val ago = "ago"
  val from_now = "from now"
}


import DateHelper._

object TestingConversions {
  def test {
    println(5 days ago)
    println(5 days from_now)
  }
}





// implicit class Person

object PersonUtil {
  implicit class PersonHelper(name: String) extends AnyVal {
    def firstName() = {
      name.split("\\s")(0)
    }

    def lastName() = {
      name.split("\\s")(1)
    }
  }
}



object PersonTest {
  import PersonUtil._

  def test {
    val fullName = "Dusan Stanojevic"
    println(fullName firstName)
    println(fullName lastName)
  }
}




object Test extends App {
  TestingConversions.test
  PersonTest.test
}