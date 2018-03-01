var name = "Dusan"
def appendToName(num: Int) {
  name += num
}


def doIt(func: Int => Unit) {
  for (i <- 1 to 5) {
    func(i)
  }
}

doIt(appendToName)

println(name)