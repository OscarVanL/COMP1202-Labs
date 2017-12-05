package vehicles;

/*
 * This is an interface, as there are no obvious general methods that specifically apply to any Cycle (Bicycle/Tricycle)
 * However, there are methods speicfic to Cycles such as pedal and brake, but *how* these occur can vary by vehicle type.
 * For example, a tricycle may brake by the child putting their feet against the ground, whereas a Bicycle will have actual brakes.
 */

public abstract class Cycle extends RoadVehicle {

	public abstract void pedal();
	
	public abstract void brake();
}
