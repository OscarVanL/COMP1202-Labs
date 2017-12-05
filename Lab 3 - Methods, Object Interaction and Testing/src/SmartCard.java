
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/3
 * @author OscarVanL
 *
 */
public class SmartCard {
	private String name = "";
	Boolean staff = false;
	
	SmartCard(String owner) {
		//Constructor method, sets attribute 'name' to argument at object creation.
		this.name = owner;
	}
	
	String getOwner() {
		//Getter method, returns attribute 'name'.
		return this.name;
	}
	
	Boolean isStaff() {
		//Returns boolean as to whether the object is a staff ID or not.
		return this.staff;
	}
	
	void setStaff(Boolean state) {
		//Sets the staff attribute to the boolean argument passed into the method.
		this.staff = state;
	}
}
