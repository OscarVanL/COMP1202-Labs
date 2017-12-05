package vehicles;

/*
 * Abstract as different RoadVehicles will implement signalLeft(), signalRight() or park() differently.
 * For example, a car has indicators whereas a Bicycle signals by sticking arms out.
 */
public abstract class RoadVehicle extends Transport {
	abstract void signalLeft();
	
	abstract void signalRight();
	
	abstract void park();
}
