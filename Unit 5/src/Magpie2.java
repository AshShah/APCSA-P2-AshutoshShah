/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
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
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog")>=0||statement.indexOf("cat")>=0)
		{
			response="Tell me more about your pets.";
		}
		else if(statement.indexOf("mauro")>=0||statement.indexOf("Mauro")>=0||statement.indexOf("MAURO")>=0)
		{
			response="Tell me more cuz he seems like a dope guy to be around!";
		}
		else if(statement.indexOf("why")>=0)
		{
			response="Because I want to know as much about you as I can.";
		}
		else if(statement.indexOf("avocado")>=0)
		{
			response="Yummy yummy! Oh wait I don't know how to eat because I'm a chatbot.";
		}
		else if(statement.indexOf("crash")>=0)
		{
			response="Oh no! I hope you were safe and unharmed after your crash.";
		}
		else if (statement.length()==0)
		{
			response="Please say something.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse==4)
		{
			response="Impressive. What else?";
		}
		else if(whichResponse==5)
		{
			response="Continue on, my friend. Don't be shy.";
		}

		return response;
	}
}
