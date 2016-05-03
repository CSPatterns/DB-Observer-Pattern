public class StockGrabber implements Observer{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;
 
	public StockGrabber(){
	
		observers = new ArrayList<Observer>();
	
	}

	public void register(Observer newObserver){
		observers.add(newObserver);
	}
	
	public void unRegister(Observer deleteObserver){
		int indexObserverToDelete = observers.indexOf(deleteObserver);
		observers.remove(indexObserverToDelete);
	}
	
	public void notifyObserver(){
		for(Observer o: observers){
			o.update(ibmPrice, googPrice, aaplPrice);
		}
	}
	
	public void setIBMPrice(double newIBMPrice){
		this.ibmPrice = newIBMPrice;
	}
	
	public void setGoogPrice(double newGoogPrice){
		this.googPrice = newGoogPrice;
	}
	
	public void setAAPLPrice(double newAAPLPrice){
		this.aaplPrice = newAAPLPrice;
	}
}