package vehicles;

/*
 * Train extends abstract class Transport, as navigateTo() by train must be overridden, as trains must travel in specific ways (on tracks, to stations - not anywhere)
 * Implements refuelable as most trains must be refueled, however some trains like electric trains may 'refuel' in different ways, hence the need to Override this method.
 */

public class Train extends Transport implements Refuelable {

	boolean isElectric;
	
	Train(boolean electric) {
		isElectric = electric;
	}
	
	@Override
	void navigateTo(String place) {
		
	}

	@Override
	public void refuel() {
		//Code here depends on whether the train is diesel or electric
	}

	@Override
	public void getFuelPercentage() {
		//Also depends on whether train is diese or electric.
		
	}

}
