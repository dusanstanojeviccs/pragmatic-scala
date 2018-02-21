class Car(val year: Int) {
  private var miles: Int = 0

  def driven = miles

  def drive(miles: Int) {
    this.miles = this.miles + miles
  }

  override def toString = s"Car made in $year has been driven $driven"
}


val car = new Car(1995)
car.drive(20)

println(car.toString)
