
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/7
 * @author OscarVanL
 *
 */
public class TestCalculator {
	
	Calculator calculator = new Calculator();
	
	public static void main(String[] args) {
		
	}

	/**
	 * A test harness for the Calculator's ability to parse string inputs
	 * @return (True) if successful in all tests, or (False) if not successful in a test
	 */
	boolean testParser() {
		boolean success = true;
		
		//Test #1 for parsing, tests if addition parses and completes correctly.
		if (calculator.x("12 + 5") != 17) {
			System.out.println("[FAIL] Basic parsing fails to add.");
			success = false;
		} else {
			System.out.println("[ OK ] Parser adds correctly.");
		}
		
		//Test #2 for parsing, tests if multiplication parses and completes correctly.
		if (calculator.x("12 x 5") != 60) {
			System.out.println("[FAIL] Basic parsing fails to multiply.");
			success = false;
		} else {
			System.out.println("[ OK ] Parser multiplies correctly.");
		}
		
		//Test #3 for parsing, tests if invalid operations are rejected by returning null.
		if (calculator.x("12 [ 3") != null) {
			System.out.println("[FAIL] Parser does not return null for operators which are not supported");
			success = false;
		} else {
			System.out.println("[ OK ] Parser returns null for operators which are not supported.");
		}
		
		return success;
	}
	
	/**
	 * A test harness for the adding operation
	 * @return (True) if all adding operations were correctly calculated, or (False) if any operation failed
	 */
	boolean testAdd() {
		boolean success = true;
		
		//Test #1 for addition, tests if addition is completed successfully when a Double is passed in
		calculator.x = new Double(7);
		if (calculator.x(new Double(7)) != 14) {
			System.out.println("[FAIL] Calculator adds incorrectly");
			success = false;
		} else {
			System.out.println("[ OK ] Calculator can add positive numbers");
		}
		
		//Test #2 for addition, tests if addition is completed successfully when a Double is passed in
		calculator.x = new Double(-7);
		if (calculator.x(new Double(-7)) != -14) {
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
			success = false;
		} else {
			System.out.println("[ OK ] Calculator can add a negative number");
		}
		
		return success;
	}
	
	/**
	 * A test harness for the multiplication operation
	 * @return (True) if all multiplication operations were correctly calculated, or (False) if any operation failed
	 */
	boolean testMultiplication() {
		boolean success = true;
		
		//Test #1 for multiplication, tests if it is completed successfully when a double is passed in 
		//(in this case, 6 is automatically cast to a double)
		calculator.x = (double) 5;
		if (calculator.x(6) != 30) {
			System.out.println("[ERROR] Calculator multiplies incorrectly");
			success = false;
		} else {
			System.out.println("[ OK ] Calculator can multiply positive numbers");
		}
		
		//Test #2 for multiplication, tests if it is completed successfully when a double is passed in
		//(in this case, -6 is automatically cast to a double)
		calculator.x = (double) -5;
		if (calculator.x(-6) != 30) {
			System.out.println("[ERROR] Calculator multiplies by negative incorrectly");
			success = false;
		} else {
			System.out.println("[ OK ] Calculator can multiply by a negative number");
		}
		
		return success;
	}
}
