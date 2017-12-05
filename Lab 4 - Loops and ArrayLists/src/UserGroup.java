import java.util.ArrayList;
import java.util.Iterator;

/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/4
 * @author OscarVanL
 *
 */
public class UserGroup {
	ArrayList<User> array;
	
	UserGroup() {
		array = new ArrayList<User>();
		
	}
	
	void addSampleData() {
		User user1 = new User("john", "user", "John Smith");
		User user2 = new User("soton", "admin", "Southampton");
		User user3 = new User("snowden", "admin", "Edward Snowden");
		User user4 = new User("isolutions", "admin", "iSolutions");
		User user5 = new User("i<3maths", "editor", "John Doe");
		User user6 = new User("oscar", "user", "Oscar Smith");
		User user7 = new User("z3no", "user", "Zeno Dude");
		User user8 = new User("j4n3", "editor", "Jane Smith");
		User user9 = new User("sesh", "user", "Zach Sutherland");
		User user10 = new User("jojo", "editor", "Joanna Cooke");
		this.array.add(user1);
		this.array.add(user2);
		this.array.add(user3);
		this.array.add(user4);
		this.array.add(user5);
		this.array.add(user6);
		this.array.add(user7);
		this.array.add(user8);
		this.array.add(user9);
		this.array.add(user10);
	}
	
	public User getUser(int userIndex) {
		return this.array.get(userIndex);
	}
	
	public int size() {
		return this.array.size();
	}
	
	public void printUsernames() {
		for (User i : array) {
			System.out.println(i.getName());
		}
	}
	
	public void removeFirstUser() {
		array.remove(0);
	}
	
	public void removeLastUser() {
		//Removes the last user in the ArrayList, the size has 1 subtracted as the ArrayList is 0 indexed.
		array.remove(array.size() - 1);
	}
	
	public void removeUser(String username) {
		Iterator<User> iterator = array.iterator();
		
		while (iterator.hasNext()) {
			User user = iterator.next();
			
			if (user.getUsername().equals(username)) {
				iterator.remove();
				System.out.println("User " + username + " was removed successfully");
			}
		}
	}
	
	public Iterator<User> getUserIterator() {
		Iterator<User> iterator = array.iterator();
		return iterator;
	}
	
	public void add(User user) {
		array.add(user);
	}
}
