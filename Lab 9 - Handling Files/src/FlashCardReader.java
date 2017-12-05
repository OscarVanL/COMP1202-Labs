import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/9
 * @author OscarVanL
 *
 */
public class FlashCardReader {
	
	BufferedReader reader;
	
	/**
	 * Constructor for FlashCardReader which creates a BufferedReader for the text file containing the Questions.
	 */
	FlashCardReader() {
		try {
			this.reader = new BufferedReader(new FileReader("Questions.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error accessing file Questions.txt");
			e.printStackTrace();
		}
	}
	
	/**
	 * Method for retrieving the next line from the text file containing the questions.
	 * @return The line retrieved if successful.
	 */
	public String getLine() {
		String currentLine;
		
		try {
			if ((currentLine = reader.readLine()) != null) {
				return currentLine;
			}
		} catch (IOException e) {
			System.out.println("Error reading from file Questions.txt");
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * Returns a boolean as to whether the file is ready to be accessed or not
	 * @return True (file is ready to be accessed), False (file is not ready to be accessed)
	 */
	public boolean isFileReady() {
		try {
			return reader.ready();
		} catch (IOException e) {
			System.out.println("Error accessing file Questions.txt");
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * Gets every line from the file, splits it by the divider (:) and then creates a FlashCard object from it. These are added to an ArrayList of FlashCards and then returned.
	 * @return ArrayList<FlashCard> containing all the flash cards contained in the file
	 */
	ArrayList<FlashCard> getFlashCards() {
		ArrayList<FlashCard> cards = new ArrayList<FlashCard>();
		
		while (isFileReady()) {
			String[] questionAnswer = getLine().split(":");
			cards.add(new FlashCard(questionAnswer[0], questionAnswer[1]));
		}
		
		return cards;
	}

	
}
