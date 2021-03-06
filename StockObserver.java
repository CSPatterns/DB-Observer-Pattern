public class Stockobserver implements Observer{

	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;

    // Static used as a counter
	private static int observerIDTracker = 0; 


    // use to track Observers
	private int observerID;

	private Subject stockGrabber;

	private int ObserverTracker = 0;

	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;

		this.observerID = ++observerIDTracker;

		System.out.println("New Observer + this.observerID");

		stockGrabber.register(this);
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