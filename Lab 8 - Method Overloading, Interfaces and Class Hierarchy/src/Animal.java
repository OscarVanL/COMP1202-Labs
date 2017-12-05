
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/8
 * @author OscarVanL
 *
 */
public abstract class Animal implements Comparable<Animal> {
	private String name;
	private int age;
	
	/**
	 * Animal Constructor, initialises attributes name and age.
	 * @param name: String to assign to attribute name
	 * @param age: int to assign to attribute age.
	 */
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 
	 */
	Animal() {
		this("newborn", 0);
	}
	
	/**
	 * Getter method for attribute name
	 * @return name: String containing attribute name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter method for attribute age
	 * @return age: int value of attribute age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Abstract method makeNoise() requires subclasses to implement a makeNoise() method
	 */
	abstract void makeNoise();
	
	/**
	 * Abstract method eat() requires subclasses to implement an eat() method
	 * @param food: Object of type Food to be fed to the animal
	 * @throws Exception: If the incorrect food is fed to an animal (eg: If meat is fed to a Herbivore)
	 */
	public abstract void eat(Food food) throws Exception;

	/**
	 * Repeatedly feeds an animal a certain food for a defined number of times
	 * @param food: Object of type food to be fed to the animal
	 * @param times: Number of times to feed the animal
	 */
	public void eat(Food food, int times) throws Exception {
		for (int i=0; i<times; i++) {
			eat(food);
		}
	}
	
	/**
	 * Allows comparison of two animals by age. Used in Demo.java with Collections.sort() to sort by age low-to-high.
	 * Eg: dog.compareTo(cat). Returns 1 if dog's age > cat's age. Returns -1 if cat > dog, returns 0 if cat == dog.
	 * If we wished to sort by high-to-low, we could swap the comparison statements around (swap < and >)
	 * @param animal: Animal to be compared to.
	 */
	public int compareTo(Animal animal) {
		if (this.age > animal.getAge()) {
			return 1;
		} else if (this.age < animal.age) {
			return -1;
		} else {
			return 0;
		}
	}

}
