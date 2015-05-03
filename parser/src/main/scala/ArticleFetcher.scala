import org.joda.time.DateTime;
trait ArticleFetcher { 
	type Result = (DateTime, String, String) // Publication date, title, url
	def getArticles(tickerSymbol: String, stockName: String): List[Result]
}