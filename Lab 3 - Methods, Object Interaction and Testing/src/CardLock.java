
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/3
 * @author OscarVanL
 *
 */
public class CardLock {
	
	SmartCard lastCard;
	Boolean studentsPermitted = false;
	
	void swipeCard (SmartCard card) {
		//Sets the lastCard attribute to the SmartCard object passed into method
		this.lastCard = card;
	}
	
	SmartCard getLastCardSeen() {
		//Returns the SmartCard passed into the lock in the swipeCard method.
		return lastCard;
	}
	
	boolean isUnlocked() {
		//Logic to determine if the person should be allowed in. Staff are allowed in regardless, whereas
		//students are only permitted into rooms where studentsPermitted = true.
		if (lastCard.isStaff()) {
			return true;
		} else if (studentsPermitted) {
			return true;
		} else {
			return false;
		}
	}
	
	void toggleStudentAccess() {
		//Toggles the state of student access.
		this.studentsPermitted = !this.studentsPermitted;
	}
}
