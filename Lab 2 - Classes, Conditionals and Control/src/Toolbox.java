/* To use Toolbox.java, copy and paste this code into a file called Toolbox.java
 * and save it in the directory with the rest of your code.
 * @author niversity of Southampton ECS
 */
import java.io.*;
import java.lang.Integer;
import java.util.Random;
 
/**
 * Provides a mechanism to read integers and strings
 * @author University of Southampton ECS
 *
 */
public class Toolbox
{
 
	public Integer getRandomInteger(Integer max)
	{
		Random rand = new Random();
		int number;
		number = rand.nextInt(max) + 1;
		return new Integer(number);
	}
 
	public Integer readIntegerFromCmd()
	{
		System.out.println("Enter your number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number;
		number = null;
 
		try
		{
			number = br.readLine();
		}
		catch (IOException ioe)
		{
			System.err.println("There was an input error");
		}
 
		try
		{
			return new Integer(number);
		}
		catch (NumberFormatException e)
		{
			System.err
					.println("There is something wrong with the number you entered");
		}
		return 0;
	}
 
	public String readStringFromCmd()
	{
		System.out.println("Enter your String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string;
		string = null;
 
		try
		{
			string = br.readLine();
		}
		catch (IOException ioe)
		{
			System.err.println("There was an input error");
		}
		return string;
	}
}