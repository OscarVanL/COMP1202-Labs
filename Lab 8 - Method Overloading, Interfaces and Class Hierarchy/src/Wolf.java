
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public class Wolf extends Carnivore {
	
	/**
	 * Main constructor, takes name and age as arguments. These are passed to superclass's constructor (which in turn also passes to its superclass constructor too).
	 * @param name: String name of our Wolf
	 * @param age: Integer age of our Wolf
	 */
	Wolf(String name, int age) {
		super(name, age);
	}
	
	/**
	 * Overloaded constructor with no attributes
	 */
	Wolf() {
		super();
	}
	
	/**
	 * Main constructor, takes name and age as arguments. These are passed to superclass's constructor (which in turn also passes to its superclass constructor too).
	 * @param name: String name of our Parrot
	 * @param age: Integer age of our Parrot
	 */
	public void makeNoise() {
		System.out.println("Woof");
	}
	
}
