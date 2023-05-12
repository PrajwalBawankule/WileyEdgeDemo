package Optimization;

//Lazy Initialization is a techinque that displays that creation of an object until it is actually needed

public class DefineClass {

	//Inefficient way of creating object immediately
	//Private Object DefineClass = new Object();
	
	private Object myObject;
	public Object getMyObject() {
		if(myObject == null) {
			myObject = new Object();
		}
		return myObject;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
