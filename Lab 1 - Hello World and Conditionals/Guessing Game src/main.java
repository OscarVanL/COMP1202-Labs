/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/1
 * @author OscarVanL
 *
 */
public class main {

	public static void main(String[] args) {
		Toolbox myToolbox = new Toolbox();
		int numberToGuess = myToolbox.getRandomInteger(100);
		int guessedNumber = 0;
		boolean unguessed = true;
		
		System.out.println("Welcome to the game!");
		while (unguessed) {
			System.out.println("Guess a number between 0 and 100");
			guessedNumber = myToolbox.readIntegerFromCmd();
			if (guessedNumber > numberToGuess) {
				System.out.println("Too high!");
			} else if (guessedNumber < numberToGuess) {
				System.out.println("Too low!");
			} else if (guessedNumber == numberToGuess) {
				System.out.println("You win!");
				unguessed = false;
			} else {
				System.out.println("Something went wrong.");
			}
		}
	}

}
