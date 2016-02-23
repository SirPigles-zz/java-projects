//Suppress warnings
@SuppressWarnings("static-access")

public class Error {
	
	public static void trow(String err)
	{
		//get in the main
		main pr = new main();
		
		//say it went wrong
		pr.p("Something whent wrong!");
		pr.p("The system said: ");
		pr.p(" " + err + " ");
		
		//Stop the program
		pr.end();
	}
	
}
