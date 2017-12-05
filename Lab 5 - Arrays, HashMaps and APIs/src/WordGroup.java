import java.util.HashMap;
import java.util.HashSet;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/5
 * @author OscarVanL
 *
 */
public class WordGroup {
	String words;
	
	WordGroup(String input) {
		words = input.toLowerCase();
	}
	
	String[] getWordArray() {
		return words.split(" ");
	}
	
	//Function returns a HashSet of all words contained in this WordGroup as well as the argument.
	HashSet<String> getWordSet(WordGroup group) {
		
		HashSet<String> wordSet = new HashSet<String>();
		
		String[] thisWords = this.getWordArray();
		String[] parameterWords = group.getWordArray();
		
		for (int i=0; i<thisWords.length; i++) {
			wordSet.add(thisWords[i]);
		}
		
		for (int j=0; j<parameterWords.length; j++) {
			wordSet.add(parameterWords[j]);
		}
		
		return wordSet;
	}
	
	//Function returns a HashSet of all words in this WordGroup as well as the number of times they occur
	HashMap<String, Integer> getWordCounts() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] words = getWordArray();
		
		for (int i=0; i<words.length; i++) {
			//If the hashmap already contains a key entry for that word, increase its value by one.
			if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1); 
			} else {
				//If it doesn't already contain that word, this is the first instance of it.
				map.put(words[i], 1);
			}
		}
		
		return map;
	}

}
