import java.util.Random;
import java.util.Scanner;
//imports

@SuppressWarnings("static-access")
//Fixing warnings on cd.*

public class main {
	//Main Class

	public static Scanner scan = new Scanner(System.in);
	//Create Scanner

	public static Random ran = new Random();
	//Create Random

	public static String name, stmp;
	//Global Strings
	public static int injuries, food, water, badages, tmp, day = 0, fday = 9999, tree = 1;
	//Global Ints
	public static boolean forr, inv, btree;
	//Bools, check day change prints.

	public static cdn cd = new cdn();
	//Acsses to the CDN.

	public static void main(String args[])
	{
		btree = false;
		p("Please enter your name");
		String sname = scan.nextLine();
		//Get name
		p("Hello " + sname + ", would you like to start the game?");
		//Welcome
		p("y/n");
		//Ask to start
		stmp = scan.nextLine();
		//Get answer
		stmp.toLowerCase();
		//Correct for caps if needed.
		if (stmp.equals("y"))
		{
			//If yes
			cd.MakePerson(sname);
			start(1);
			//Game Start.
		}
		else
		{
			Error.trow("Initialization start error. CD.1.");
			//Silly end of script if no to game start
		}
	}
	
	public static void end()
	{
		System.exit(0);
		//Stop script, prevent other things from running if the player dies.
	}

	public static void start(int dayOnePass)
	{
		//Game Start
		while(true)
		{
			
		if (forr || inv) //Checks if a new location needs to be givin to the player.
		{
			//Check if the player has returned from forage or inventory
			forr = false;
			inv = false;
			cd.PrintMenue(1);
			//If yes, do not print new location
		}
		else {
			cd.PrintMenue(0);
			//If no print new location.
		}

		tmp = cd.SCAN();
		//Get what they want to do in the main menu.

		//main choice switch for the main menu.
		switch ( tmp )
		{
			case 1:
				day();
				//cycles the day.
			break;
			case 2:
				Forrage();
				//Starts a forrage for itmes.
			break;
			case 3:
				inv = true;
				//tells main menu that the invetory was opned.
				cd.inv();
				//Runs the inventory/use items.
			break;
			case 2413:
				cd.cheats();
			break;
			default:
				//reprints the menu if something that is not an option in picked.
				start(0);
				break;
			}
		}
	}

	public static void Forrage()
	{
		//Forrage main.
		forr = true;
		//Tells main menu that forrage was used.
		if (cd.potato()) //Checks if user has forraged in the day before.
		{
			cd.forrItem();
			//If ok, get the item from CD
		}
		else
		{
			//User has already looked.
			p("You have already searched this place.");
		}
	}

	public static void day()
	{
		//Day cycle.
		if(cd.ded()) //Checks of the player has died.
		{
			//Death announcment start.
			p(" ------------------------- ");
			p(name + " died on day: " + day + ".");
			if (food <= 0) //Checks if they starved.
			{
				p("You died of the food foods.");
			}else if (water <= 0) //Checks if they died of thirst
			{
				p("You died as raisin.");
			}else{
				//If this code get run they died of ings
				p("Your life sucks, died of your " + cd.GetIng() + ".");
			}
			end();
			//End the game.
		}
		else if ( day >= 20) //If this runs then the player has won, they passed day 20
		{
			//Win announcment.
			p("You realize,");
			p("'what if this is just a game, what if I'm not really here...'");
			p("As you are lost, deep in thought, you notice a bright, white light approaching you.");
			p("It's a train,");
			p("it turns out you were just a homeless person who lived near a railroad the entire time.");
			p("Dont do acid kids.");
			end();
			//end game
			
		} else
		{
			//if this gets run it is a normal day.
			clearScreen();
			//Print spaces
			day++;
			//Add another day.
			tmp = injuries;
			//Hold a temp on pain.
			cd.ing("d");
			//This will add an injury if the user got one.
			if (tmp < injuries) //Check if they got one.
			{
				//Tell them what they got.
				p("While wandering you got a " + cd.GetIng() + ".");
			}
			//Allow forrage to be used again.
			fday--;
			//Eat food.
			cd.Eat();
			return;
		}
	}

	public static String location()
	{
		//Make array with locations.
		int tteemmpp = ran.nextInt(6);
		if (tteemmpp == 0)
		{
			return cd.treeMain();
		}
		else
		{
			String[] locs = {"a mountain", "a cave near a waterfall", "a vally", "the top of a hill", "a cave in a mountain", "a parallel universe", "your mom's house", "a jungle", "a desert", "a hollow tree", "a shoe store"};
			//Get a random one.
			return cd.getRndArr(locs);
		}
	}

	public static void p(String text)
	{
		//Print used printer,
		//It's super effective.
		cd.Printer(text);
	}

	public static void clearScreen()
	{
		//Clear Screen.
		cd.clear();
		return;
	}
}
