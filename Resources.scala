class Resource private() {
  def printName = println("Resource is being used")
  private def cleanUp = println("Cleaning up")
}

object Resource {
  def use(execute: Resource => Unit): Unit = {
    val res = new Resource
    execute(res)
    res.cleanUp
  }
}




Resource.use { res =>
  res.printName
}
