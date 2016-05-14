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
			
			
			//generate random numbers between 0.6 and -0.3
			
			//set the price
			
		}
	}
}