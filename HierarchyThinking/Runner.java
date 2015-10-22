import java.util.Scanner;

/**
 * A simple class to run the Brain class.
 * @author
 * @version
 */
public class Runner
{

	/**
	 * Create a Brain, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Brain neocortex = new Brain();
		
		System.out.println (neocortex.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("bye"))
		{
			System.out.println (neocortex.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
