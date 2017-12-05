
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/6
 * @author OscarVanL
 *
 */
public abstract class Herbivore extends Animal {

	/**
	 * Constructor method for Herbivore, name and age are probably passed by child classes (such as Brachiosaurus), then superclass (Animal) constructor is called
	 * @param name: Name of the Herbivore as a String
	 * @param age: Age of the Herbivore as an int
	 */
	Herbivore(String name, int age) {
		super(name, age);
	}

	/**
	 * Attempts to eat the food, if it is an instanceof class Plant then it is successful. If it is Meat, an exception is thrown.
	 * @param food: Food object to be fed to the Herbivore
	 * @exception Exception: Exception thrown when incorrect Food child class is fed to Herbivore (Meat)
	 */
	public void eat(Food food) throws Exception {
		//Ensures that the food is a plant, else throws an exception
		if (food instanceof Plant) {
			System.out.println(this.getName() + " is eating the " + food.getFoodName());
		} else if (food instanceof Meat) {
			throw new Exception("Meat was given to Herbivore " + this.getName());
		}
	}
	
}
