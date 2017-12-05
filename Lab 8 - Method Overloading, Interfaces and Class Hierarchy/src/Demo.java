
import java.util.ArrayList;
import java.util.Collections;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Wolf("Skip", 5));
		animalList.add(new Wolf("BigDog", 11));
		animalList.add(new Wolf());
		animalList.add(new Parrot(8));
		animalList.add(new Parrot("Sandra", 18));
		animalList.add(new Parrot("Squarker", 7));
		animalList.add(new Brachiosaurus("Carnassa", 9));
		animalList.add(new Brachiosaurus("Barnabus", 100));
		animalList.add(new Brachiosaurus("Dred", 105));
		
		//Interface definition/explanation:
		//Similar to a class, however can only contain method signatures and fields.
		//Cannot contain any content in the methods, only signatures.
		//Useful for achieving consistent Polymorphism.
		
		System.out.println("== Before sort ==");
		printAnimals(animalList);
		Collections.sort(animalList);
		System.out.println("== After sort == ");
		printAnimals(animalList);
		
		//Above sorts from youngest to oldest animals.
		//To change this, we could modify the compareTo() method in Animal.java and swap around the comparison statements (< and >).

	}
	

	/**
	 * Prints our arrayList of animals, for each animal their name and age is printed.
	 * @param animalList: ArrayList to be printed
	 */
	static void printAnimals(ArrayList<Animal> animalList) {
		for (Animal animal : animalList) {
			System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");
		}
	}
}
