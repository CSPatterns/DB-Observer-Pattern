public class Stockobserver implements Observer{

	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;

	private Subject stockGrabber;

	private int ObserverTracker = 0;

	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
	}

	public void update(double ibmPrice, double googPrice, double aaplPrice){

	this.ibmPrice = ibmPrice;
	this.googPrice = googPrice;
	this.aaplPrice = aaplPrice;

	printThePrices();

	}

	public void printThePrices(){

		System.out.println("IBMPrice: " + this.ibmPrice + "/n" ...

	}

}