def getYearEndClosingPrice(symbol: String, year: Int) = {
  val url = s"https://www.quandl.com/api/v1/datasets/WIKI/$symbol.csv?column=4&sort_order=asc&collapse=quarterly&trim_start=$year-01-01&trim_end=$year-01-02"

  val data = io.Source.fromURL(url).mkString
  val price = data.split("\n")(1).split(",")(1).toDouble
  price
}


val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
val year = 2014
val (topStock, topPrice) =
  symbols.map { symbol => (symbol, getYearEndClosingPrice(symbol, year)) }
          .maxBy { stockPrice => stockPrice._2 }

println(s"Top stock is: $topStock with price of $topPrice")