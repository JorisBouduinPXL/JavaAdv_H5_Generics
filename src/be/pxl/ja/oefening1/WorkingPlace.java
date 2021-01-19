package be.pxl.ja.oefening1;

public class WorkingPlace<T extends Vehicle> implements Motorized {  // enkel vehicle die motorized
//	public class WorkingPlace<T> implements Motorized { // enkel motorized
//	public class WorkingPlace<T extends Vehicle> {      // enkel vehicle

	private T thingToFix;
	private int numberOfThingsFixed = 0;

	public boolean isEmpty() {
		return thingToFix == null;
	}

	public void startFixing(T vehicle) {
		if (!isEmpty()) {
			System.out.println("Already busy.");
		} else {
			this.thingToFix = vehicle;
		}
	}

	public void finished() {
		thingToFix = null;
		numberOfThingsFixed++;
	}

	public int getNumberOfThingsFixed() {
		return numberOfThingsFixed;
	}


}
