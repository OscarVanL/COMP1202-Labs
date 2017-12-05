package vehicles;

/*
 * JetPlane is a form of Transport, Transport is abstract as certain methods like getPosition() are generic to all transport vehicles, whereas navigateTo() must be overridden as a plane navigates differently to other vehicles (eg; cars)
 * Refuelable is implemented as an interface, as different vehicles will refuel in different ways, so an overridden/unique implementation is required.
 */

public class JetPlane extends Transport implements Refuelable {

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFuelPercentage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void navigateTo(String place) {
		// TODO Auto-generated method stub
		
	}

}
