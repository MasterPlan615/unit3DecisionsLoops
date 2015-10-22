import java.util.Scanner;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author
 * @version
 */
public class Brain
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        String response2 = "";
        if (statement.indexOf("hello") >= 0)
        {
            response = "Hello, how are you?";
            
        }
        if ((statement.indexOf("good") >=0)||
            (statement.indexOf("fine") >=0)||
            (statement.indexOf("ok") >=0))
            {
                response = "That's good to hear";
            }
        if (statement.indexOf("what is your name?") >=0)
        {
            Scanner nameask = new Scanner(System.in);
            System.out.println("You tell me: ");
            String name = nameask.next();
            response = "I guess my new name is "+name;
            int len = name.length();
            if (len >= 10)
            {
                response2 = "That's quite a long name. I'd rather not be called that";
                return response2;
            }
        }
        if (statement.indexOf("mother pheasant plucker") >= 0)
        {
            response = "Are you a pleasant mother pheasant pleasant plucker? Don't answer that unless you're Hank Green";
        }
        return response;
    }
}
