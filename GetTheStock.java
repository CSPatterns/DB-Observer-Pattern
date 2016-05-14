public class GetTheStock impelements Runnable{
	
	private Subject stockgrabber;
	private String symbol;
	private double price;
	private double time;

	public GetTheStock(Subject stockgrabber, int time, double price, String stockSymbol){
		
		this.stockgrabber = stockgrabber;
		this.price = price;
		this.time = time;
		this.symbol = stockSymbol;
		 
	}

	
	public void run(){
		
		for (int i - 0; i < 20; i++){
			
			// get new Decimal Format
			DecimalFormat df = new DecimalFormat("#.###");
			
			
			//generate random numbers between 0.6 and -0.3
			double random = Math.random() * 0.6 - 0.3;
			
			
			
			//set the price for each stock using if statement e.g.
			//if price is IBM
			
			if(symbol == "IBM"){
				stockgrabber.setIBMPrice(df(price + random));
			}
			
			if(symbol == "GOOG"){
				stockgrabber.setGOOGPrice(df(price + random));
			}
			
			
			if(symbol == "AAPL"){
				stockgrabber.setAAPLPrice(df(price + random));
			}
			
		}
	}
}