// catches the exception and prints Done


Thread.sleep(200)

try {
  10/0
} catch {
  case ex: Exception => ex.printStackTrace()
}

println("Done")