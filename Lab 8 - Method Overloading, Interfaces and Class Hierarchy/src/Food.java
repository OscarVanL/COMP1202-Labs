
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public class Food {
	
	private String foodType;
	
	/**
	 * Constructor for food that takes the name of the food
	 * @param foodType: Name of the food as a String
	 */
	Food(String foodType) {
		this.foodType = foodType;
	}
	
	
	/**
	 * Getter method for Food attribute foodType/name
	 * @return foodType: String for name of food
	 */
	public String getFoodName() {
		return foodType;
	}

}
