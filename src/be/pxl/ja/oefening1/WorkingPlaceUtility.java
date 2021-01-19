package be.pxl.ja.oefening1;

public class WorkingPlaceUtility {

	public static <T extends Motorized> int getScore(WorkingPlace<?> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
