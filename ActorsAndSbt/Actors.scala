import akka.actor._
import akka.routing._
import java.io.File

class Logger() extends Actor {
  def receive = {
    case message : String => println(message)
  }
}

class FileAnalyzer extends Actor {
  def receive = {
    case dirName : String =>
      val file = new File(dirName)
      val files = file.listFiles()
      var filesCount = 0

      if (files != null) {
        files.filter { _.isDirectory }.foreach { sender ! _.getAbsolutePath }
        filesCount = files.count { !_.isDirectory }
      }

      sender ! filesCount
  }
}

class FileCounter extends Actor {
  var files = 0
  var pending = 0
  var fileAnalyzers = context.actorOf(RoundRobinPool(100).props(Props[FileAnalyzer]))

  def receive = {
    case dirName : String =>
      pending = pending + 1
      fileAnalyzers ! dirName
    case count : Int =>
      files = files + count
      pending = pending - 1

      if (pending == 0) {
        println(s"Done with $files")
      }
  }
}


object Starter extends App {
  val actorSystem = ActorSystem("main")

  val fileCounter = actorSystem.actorOf(Props[FileCounter])

  fileCounter ! "/Users/dusanstanojevic/Documents/workspace"
}