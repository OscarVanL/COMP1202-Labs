package vehicles;

//Should be an interface, as refueling methods will need to be implemented for all refuelable vehicles, however a generic
//refuel class cannot be made as different vehicles refuel in different ways. (Eg: A jet plane refuels differently to a car)

public interface Refuelable {
	
	public abstract void refuel();
	
	public abstract void getFuelPercentage();
}
