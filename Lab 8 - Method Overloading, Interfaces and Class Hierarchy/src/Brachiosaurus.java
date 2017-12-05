
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public class Brachiosaurus extends Herbivore {

	/**
	 * Constructor method for Brachiosaurus
	 * @param name: Name of the Brachiosaurus as a String
	 * @param age: Age of the Brachiosaurus as an int
	 */
	Brachiosaurus(String name, int age) {
		super(name, age);
	}

	/**
	 * Implements abstract method makeNoise for Brachiosaurus
	 */
	@Override
	void makeNoise() {
		System.out.println("nneeyaaaaawwwwww *Jurassic Park music starts to play*");
	}

}
