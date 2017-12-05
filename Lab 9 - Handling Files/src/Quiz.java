import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/9
 * @author OscarVanL
 *
 */
public class Quiz {
	FlashCardReader cardReader;
	ArrayList<FlashCard> cards;
	Scanner sc;
	int score = 0;
	int questionsAttempted = 0;
	boolean saveAnswers;
	ArrayList<String> userAnswers;
	
	public static void main(String args[]) throws Exception {
		Quiz quiz = new Quiz();
	}
	
	/**
	 * Constructor for Quiz class, instantiates the FlashCardReader, retrieves the ArrayList of cards ready for playing the Quiz.
	 */
	Quiz() {
		cardReader = new FlashCardReader();
		cards = cardReader.getFlashCards();
		sc = new Scanner(System.in);
		saveAnswers = determineSaveSettings();
		play();
	}
	
	/**
	 * Used to determine whether the user would like to save their answers or not.
	 * @return: True (if the user would like to save answers), False (if the user does not want to save answers)
	 */
	boolean determineSaveSettings() {
		System.out.println("Would you like to save your results after completion? [y/n]");
		String choice = sc.nextLine();
		
		if (choice.equals("y")) {
			return true;
		} else if (choice.equals("n")) {
			return false;
		} else {
			System.out.println("Invalid selection. Enter y or n. Quiz will not save answers.");
			return false;
		}
	}
	
	/**
	 * Starts the quiz, iterates through the flash cards and asks questions.
	 * Records the user's answers, their score, the number of questions attempted and whether it was right/wrong
	 */
	void play() {
		String input;
		userAnswers = new ArrayList<String>();
		
		for (int i=0; i<cards.size(); i++) {
			questionsAttempted++;
			
			System.out.println("== Question " + (i+1) + " ==");
			System.out.println(cards.get(i).getQuestion());
			input = sc.nextLine();
			
			if (input.equals(cards.get(i).getAnswer())) {
				System.out.println("Correct!");
				score++;
				
				//Stores current question and the user's answer separated by a comma.
				userAnswers.add(cards.get(i).getQuestion() + "," + input + ",right");
			} else {
				System.out.println("Incorrect, the actual answer is: " + cards.get(i).getAnswer());
				userAnswers.add(cards.get(i).getQuestion() + "," + input + ",wrong");
			}
			
		}
		if (saveAnswers) {
			save();
		}
	}
	
	/**
	 * Outputs the user's quiz scores, answers and percentage correctly answered to a text file.
	 */
	void save() {
		PrintStream outputFile = null;
		
		try {
			outputFile = new PrintStream(new File("save.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error creating output file");
			e.printStackTrace();
		}
		
		for (String answer : userAnswers) {
			outputFile.println(answer);
		}
		
		//Prints user's score, number of questions asked and percentage of correct answers.
		outputFile.println(
				"User score: " + score + 
				"\nQuestions asked: " + questionsAttempted + 
				"\nPercentage correct: " + (float)(score * 100.0f) / questionsAttempted + "%"
				);
		
	}
}
