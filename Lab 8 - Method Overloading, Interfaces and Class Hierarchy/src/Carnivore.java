
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public abstract class Carnivore extends Animal {

	/**
	 * Constructor method for Carnivore, name and age are probably passed by child classes (such as Wolf), then superclass (Animal) constructor is called
	 * @param name: Name of the Carnivore as a String
	 * @param age: Age of the Carnivore as an int
	 */
	Carnivore(String name, int age) {
		super(name, age);
	}
	
	/**
	 * Overloaded constructor with no arguments
	 */
	Carnivore() {
		super();
	}
	
	/**
	 * Attempts to eat the food, if it is an instanceof class Meat then it is successful. If it is a plant, an exception is thrown.
	 * @param food: Food object to be fed to the Carnivore
	 * @exception Exception: Exception thrown when incorrect Food child class is fed to Carnivore (Plant)
	 */
	public void eat(Food food) throws Exception {
		//Ensures that the food is a meat, otherwise throws and exception
		if (food instanceof Meat) {
			System.out.println(this.getName() + " is eating the " + food.getFoodName());
		} else if (food instanceof Plant) {
			throw new Exception("Non-meat food was given to Carnivore " + this.getName());
		}
	}

}
