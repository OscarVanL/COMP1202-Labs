
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/7
 * @author OscarVanL
 *
 */
public class Main {

	public static void main(String[] args) {
		TestCalculator test = new TestCalculator();
		boolean success = true;
		
		//Runs all tests, if any do not return 'true', then it is not successful.
		if (!test.testParser() | !test.testAdd() | !test.testMultiplication())
			success = false;
		
		//Prints an appropriate message
		if (success) {
			System.out.println("Congratulations, your Calculator appears to be working.");
		} else {
			System.out.println("Unfortunately one or more tests failed.");
		}
	}
}
