
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/6
 * @author OscarVanL
 *
 */
public abstract class Omnivore extends Animal {

	/**
	 * Constructor method for Omnivore, name and age are probably passed by child classes (such as Parrot), then superclass (Animal) constructor is called
	 * @param name: Name of the Omnivore as a String
	 * @param age: Age of the Herbivore as an int
	 */
	Omnivore(String name, int age) {
		super(name, age);
	}

	/**
	 * Feeds the Omnivore. No exceptions or errors are thrown as Omnivores eat both Meat and Plants.
	 * @param food: Food object to be fed to the Omnivore
	 */
	public void eat(Food food) {
		System.out.println(this.getName() + " is eating the " + food.getFoodName());
	}

}
