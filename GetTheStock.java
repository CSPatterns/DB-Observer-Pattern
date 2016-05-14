public class GetTheStock impelements Runnable{
	
	private Subject stockgrabber;
	private String symbol;
	private double price;

	public GetTheStock(Subject stockgrabber, int time, double price, String stockSymbol){
		
		this.stockgrabber = stockgrabber;
		this.price = price;
		this.symbol = stockSymbol;
		 
	}

	
	public void run(){
		
		for (int i = 0; i < 20; i++){
			
			try{
				
				//sleep for 2 seconds
				Thread.sleep(2000);
				
			}catch(InterruptedException e){
				
			}
			// get new Decimal Format
			DecimalFormat df = new DecimalFormat("#.###");
			
			
			//generate random numbers between 0.6 and -0.3
			double random = (Math.random() * 0.6) - 0.3;
			
			//change the price
			
			price = Double.valueOf(df.format((price + randNum)));
			
			
			
			//set the price for each stock using if statement e.g.
			//if price is IBM
			
			if(symbol == "IBM"){
				((StockGrabber)stockgrabber).setIBMPrice(price);
			}
			
			if(symbol == "GOOG"){
				((StockGrabber)stockgrabber).setGOOGPrice(price);
			}
			
			
			if(symbol == "AAPL"){
				((StockGrabber)stockgrabber).setAAPLPrice(price));
			}
			
		}
	}
}