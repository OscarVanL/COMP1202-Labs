
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/6
 * @author OscarVanL
 *
 */
public class Main {

	public static void main(String[] args) {
		//Creates objects and initialises them
		Wolf wolf = new Wolf("Skip", 8);
		Parrot parrot = new Parrot("Benji", 5);
		Brachiosaurus brachio = new Brachiosaurus("Gavin", 65000001);
		
		System.out.println("The wolf is called " + wolf.getName() + ", they are " + wolf.getAge() + " years old.");
		System.out.println("The parrot is called " + parrot.getName() + ", they are " + parrot.getAge() + " years old.");
		System.out.println("The Brachiosaurus is called" + brachio.getName() + ", they are " + brachio.getAge() + " years old.");
		
		
		System.out.print(wolf.getName() + " says: ");
		wolf.makeNoise();
		System.out.print(parrot.getName() + " says: ");
		parrot.makeNoise();
		
		Meat serloinSteak = new Meat("Serloin Steak");
		Plant lettuce = new Plant("Lettuce");
		
		//Feeds the animals the incorrect food types, and catches the exceptions passed down as a result
		try {
			brachio.eat(serloinSteak);
			wolf.eat(lettuce);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
