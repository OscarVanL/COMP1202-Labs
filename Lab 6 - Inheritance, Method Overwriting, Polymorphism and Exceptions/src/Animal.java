
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/6
 * @author OscarVanL
 *
 */
public abstract class Animal {
	private String name;
	private int age;
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
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

}
