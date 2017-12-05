
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public class Main {
	//Creates objects and initialises them
	static Wolf wolf = new Wolf("Skip", 8);
	static Parrot parrot = new Parrot("Benji", 5);
	static Brachiosaurus brachio = new Brachiosaurus("Gavin", 65000001);
	static Meat serloinSteak = new Meat("Serloin Steak");
	static Plant lettuce = new Plant("Lettuce");

	public static void main(String[] args) {
		//Lab 6 main content
		//lab6();
		
		//Lab 8 main content
		lab8();
		
	}
	
	/**
	 * Lab 6's content is in this method.
	 */
	static void lab6() {
		//Introduces animals with their respective getters.
		System.out.println("The wolf is called " + wolf.getName() + ", they are " + wolf.getAge() + " years old.");
		System.out.println("The parrot is called " + parrot.getName() + ", they are " + parrot.getAge() + " years old.");
		System.out.println("The Brachiosaurus is called" + brachio.getName() + ", they are " + brachio.getAge() + " years old.");
		
		System.out.print(wolf.getName() + " says: ");
		wolf.makeNoise();
		System.out.print(parrot.getName() + " says: ");
		parrot.makeNoise();
		
		
		//Feeds the animals the incorrect food types, and catches the exceptions passed down as a result
		try {
			brachio.eat(serloinSteak);
			wolf.eat(lettuce);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	/**
	 * Lab 8's early content is in this method. (Later content is in Demo.java's main method.)
	 */
	static void lab8() {
		System.out.println("Force-feeding " + wolf.getName() + " 8 times");
		try {
			wolf.eat(serloinSteak, 8);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		Wolf newbornWolf = new Wolf();
		System.out.println("A " + newbornWolf.getName() + " wolf was just born");
	}
}
