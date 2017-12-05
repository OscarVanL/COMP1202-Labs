import java.util.Iterator;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/4
 * @author OscarVanL
 *
 */
public class Main {

	public static void main(String[] args) {
		//part1();
		//part2();
		part3();
		}
	
	private static void part1() {
		Toolbox toolbox = new Toolbox();
		System.out.println("Enter a multiplication table to calculate");
		int table = toolbox.readIntegerFromCmd();
		
		//iteration variable i is assigned to 1 so that the times tables don't start with the 0th multiple.
		for (int i=1;i<=20;i++) {
			System.out.println(table*i);
		}
		
		int total = 0;
		int consecutiveInt = 1;
		int count = 0;
		//For each iteration the amount added to the total is increased, until the total exceeds 500.
		//The count is iterated to record how many additions were required.
		while (total < 500) {
			total += consecutiveInt;
			consecutiveInt++;
			count++;
		}
		System.out.println("It took " + count + " consecutive integer additions to make a total over 500.");
	}

	private static void part2() {
		UserGroup users = new UserGroup();
		users.addSampleData();
		users.printUsernames();
		users.removeUser("isolutions");
		users.printUsernames();
	}
	
	private static void part3() {
		//Creates the original group and enters sample data.
		UserGroup users = new UserGroup();
		users.addSampleData();
		
		//Creates a new group just for administrators.
		UserGroup administrators = new UserGroup();
		
		//Gets the iterator for the original group.
		Iterator<User> iterator = users.getUserIterator();
		
		while (iterator.hasNext()) {
			User user = iterator.next();
			
			if (user.getUserType().equals("admin")) {
				administrators.add(user);
			}
		}
		
		System.out.println("Printing all administrator names:");
		administrators.printUsernames();
		//This line causes an inconsistency whereby the administrators UserGroup contains non-administrators.
		//Meanwhile, in the original group this person is still listed as an administrator = Data integrity violated as it differs in
		//two locations.
		administrators.getUser(administrators.size() - 1).setUserType("user");
		System.out.println("---Printing UserGroup for all Users:---");
		users.printUsernames();
		System.out.println("---Printing administrators UserGroup:---");
		administrators.printUsernames();
		//A solution for this problem could be to change the code to just remove the user from the administrator group instead of modifying the
		//user type, then changing the type of that user in the original 'all users' UserGroup.
	}
}
