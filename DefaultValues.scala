def mail(destination: String = "head office", mailClass: String = "first") =
  println(s"sending to $destination by $mailClass")


mail("Huston office", "Priority")
mail("San Francisco office")
mail()
mail(mailClass = "regular")
mail(mailClass = "regular", destination = "California")