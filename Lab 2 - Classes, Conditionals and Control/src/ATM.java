/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/2
 * @author OscarVanL
 *
 */
public class ATM {
	
	public static void main(String[] args) {
		ATM myATM = new ATM();
		myATM.go();

	}

	public static void go() {
		System.out.print("Wecome to online ATM banking\nHow much do you want in your account?\n");
		Toolbox myToolbox = new Toolbox();
		int amount = 0;
		int input = 0;
		//Repeatedly takes inputs until a valid starting balance is entered (sanitised inputs)
		while (true) {
			input = myToolbox.readIntegerFromCmd();
			if (input >= 0) {
				amount = input;
				break;
			}
		}
		inquire(amount); //Displays starting amount
		
		while (true) {
			System.out.println("What do you want to do?\n1 : Withdraw\n2 : Deposit\n3 : Inquire\n4 : Quit\n");
			int choice = myToolbox.readIntegerFromCmd();
			if (choice == 1) {
				amount = withdraw(amount);
			} else if (choice == 2) {
				amount = deposit(amount);
			} else if (choice == 3) {
				inquire(amount);
			} else if (choice == 4) {
				quit();
			} else {
				System.out.println("Incorrect choice");
			}
		}
	}
	
	public static int withdraw(int amount) {
		printString("Withdrawal");
		printString("How much would you like to withdraw?");
		Toolbox myToolbox = new Toolbox();
		int withdrawAmount = 0;
		while(true) { //Input sanitisation, repeatedly takes amounts to withdraw until a positive integer that does not leave a negative balance is entered.
			withdrawAmount = myToolbox.readIntegerFromCmd();
			if (((amount - withdrawAmount) >= 0) && (withdrawAmount >= 0)) {
				amount = amount - withdrawAmount;
				break;
			} else {
				System.out.println("Input error, enter a positive integer that does not leave you overdrawn");
			}
		}
		return amount;
	}
	
	public static int deposit(int amount) {
		printString("Deposit");
		printString("How much would you like to deposit");
		Toolbox myToolbox = new Toolbox();
		int depositAmount = 0;
		while(true) { //Input sanitisation, repeatedly takes amounts to deposit until a positive integer is entered.
			depositAmount = myToolbox.readIntegerFromCmd();
			if (depositAmount >= 0) {
				amount = amount + depositAmount;
				break;
			} else {
				System.out.println("Input error, enter a positive integer.");
			}
		}
		return amount;
	}
	
	public static void inquire(int amount) {
		String output = "Your balance is: \u00A3" + amount;
		printString(output);
	}
	
	public static void quit() {
		printString("Goodbye!");
		System.exit(0);
	}
	
	public static void printString(String text) {
		String divider = "********************************************";
		System.out.println(divider + "\n   " + text + "   \n" + divider);
	}
}
