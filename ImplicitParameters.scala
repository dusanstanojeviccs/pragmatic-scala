class Wifi(name: String) {
  override def toString = name
}

def connectToNetwork(user: String) (implicit wifi: Wifi): Unit = {
  println(s"User $user is connected to $wifi")
}

def fromHome(): Unit = {
  implicit val wifi = new Wifi("wifi at the home")

  connectToNetwork("Dusan")
}

def fromTheOffice(): Unit = {
  implicit val wifi = new Wifi("wifi at the office")

  connectToNetwork("Dusan")
}


fromHome
fromTheOffice