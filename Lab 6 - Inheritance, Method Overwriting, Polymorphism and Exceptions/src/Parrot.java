
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/6
 * @author OscarVanL
 *
 */
public class Parrot extends Omnivore {
	
	/**
	 * Main constructor, takes name and age as arguments. These are passed to superclass's constructor (which in turn also passes to its superclass constructor too).
	 * @param name: String name of our Parrot
	 * @param age: Integer age of our Parrot
	 */
	Parrot(String name, int age) {
		super(name, age);
	}
	
	/**
	 * Overloaded constructor, only takes age as argument. Name attribute is just set to "Polly". Passes these to superclass.
	 * @param age: Integer age of our Parrot
	 */
	Parrot(int age) {
		super("Polly", age);
	}
	
	/**
	 * Prints the noise our Parrot males, "Squark!"
	 */
	public void makeNoise() {
		System.out.println("Squark!");
	}
}
