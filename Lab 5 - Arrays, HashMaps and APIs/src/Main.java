import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/5
 * @author OscarVanL
 *
 */
public class Main {

	public static void main(String[] args) {
		//Part 1 from gere:
		WordGroup plato = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup roosevelt = new WordGroup("When you play play hard when you work dont play at all");

		String[] platoArray = plato.getWordArray();
		String[] rooseveltArray = roosevelt.getWordArray();
		
		System.out.println("===Printing Plato Quote Array===");
		for (int i=0; i<platoArray.length; i++) {
			System.out.println(platoArray[i]);
		}
		
		System.out.println("===Printing Roosevelt Quote Array===");
		for (int j=0; j<rooseveltArray.length; j++) {
			System.out.println(rooseveltArray[j]);
		}
		
		//Part 2 from here:
		HashSet<String> hashSet = plato.getWordSet(roosevelt);
		
		System.out.println("===Printing Combined Quote HashSet===");
		for(String element : hashSet) {
			System.out.println(element);
		}
		
		//Part 3 from here:
		
		System.out.println("===Printing plato WordCounts===");
		HashMap<String, Integer> platoHash = plato.getWordCounts();
		//Gets a set of all the keys in the HashMap, then iterates over this to find the
		//associated values in the HashMap
		Set<String> platoSet = platoHash.keySet();
		for (String key : platoSet) {
			System.out.println(key + ": " + platoHash.get(key));
		}
		
		System.out.println("===Printing roosevelt WordCounts===");
		HashMap<String, Integer> rooseveltHash = roosevelt.getWordCounts();
		//Same as above section of code, but for roosevelt's quote.
		Set<String> rooseveltSet = rooseveltHash.keySet();
		for (String key : rooseveltSet) {
			System.out.println(key + ": " + rooseveltHash.get(key));
		}
		
		System.out.println("===Printing combined word set and counts===");
		
		//Iterates over the hashSet of all words in both quotes, then nested for-loops
		//iterate over all the words in the quotes key-sets and total the number of uses.
		for (String word : hashSet) {
			int wordRepetition = 0;
			for (String platoKey : platoSet) {
				if (word.equals(platoKey)) {
					wordRepetition += platoHash.get(platoKey);
				}
			}
			for (String rooseveltKey : rooseveltSet) {
				if (word.equalsIgnoreCase(rooseveltKey)) {
					wordRepetition += rooseveltHash.get(rooseveltKey);
				}
			}
			System.out.println(word + " " + wordRepetition);
		}
	}

}
