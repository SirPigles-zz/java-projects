import java.util.Random;
//Import Random.

@SuppressWarnings("static-access")
//Stops warning on ma.*

public class cdn {
	//Start

	public static main ma = new main();
	//Make acsses to the main.
	
	public static boolean btree;
	
	public static void p(String text)
	{
		//Private printer just for the CDN
		System.out.println(text);
		return;
	}

	public static void Printer(String text)
	{
		//Public printer, used by the main.
		System.out.println(text);
		return;
	}

	public static void clear()
	{
		//Clear screen just adds a bunch of space to make it more clear.
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		Printer(" ");
		return;
	}

	public static void ing(String loc)
	{
		//Overrlly complex thing to get one in 3 inguries on wander.
		switch ( loc )
		{
		case "d":
			if(ma.ran.nextInt(3) == 0)
			{
				use(1, "ing");
			}
		break;
		}
		return;
	}

	public static void MakePerson(String name)
	{
		//Creates the person.
		ma.name = name;
		//Set name to storage.
		ma.injuries = 0;
		//set no injiures, later difficuties might be higher.
		ma.food = 5;
		//Set default food.
		ma.water = 5;
		//Set Default water.
		ma.badages = 0;
		//Set default bandages.
		return;
	}

	public static void Eat()
	{
		//eat food and water for a day.
		use(-1, "water");
		use(-1, "food");
		ma.btree = true;
	}

	public static void PrintMenue(int YNForrage)
	{
		//Print the menue
		if (YNForrage == 1) //Checks if forrage or inventory was used.
		{
			p(" ------------------------- ");
			p("Day: " + ma.day);
			//Print day
			p("You have " + ma.injuries + " Injuries.");
			//Give info
			p(ma.water + " Days of water.");
			p(ma.food + " Days of food.");
			//End of info.
			p(" ------------------------- ");
			//Wut do fam
			p("What do you want to do?");
			p("<1> Wander.");
			p("<2> Forrage.");
			p("<3> Use an item.");
			return;
		}
		else
		{
			//Same as above, but new location.
			p(" ------------------------- ");
			p("You arrive at " + ma.location() + ".");
			p("Day: " + ma.day);
			p("You have " + ma.injuries + " Injuries.");
			p(ma.water + " Days of water.");
			p(ma.food + " Days of food.");
			p(" ------------------------- ");
			p("What do you want to do?");
			p("<1> Wander.");
			p("<2> Forrage.");
			p("<3> Use an item.");
			return;
		}
	}

	public static void inv()
	{
		//bandages
		if (ma.badages == 0)
		{
			p("You have no bandages.");
		}
		else if (ma.badages == 1)
		{
			p("You have one bandage.");
		}
		else
		{
			p("You have " + ma.badages + " bandages.");
		}
		//Water
		if (ma.water == 0)
		{
			p("You have no more water.");
		}
		else if (ma.water == 1)
		{
			p("You have one day of water left.");
		}
		else
		{
			p("You have " + ma.water + " days of water left.");
		}
		//food
		if (ma.food == 0)
		{
			p("You have no more food left.");
		}
		else if (ma.food == 1)
		{
			p("You have one day of water left.");
		}
		else
		{
			p("You have " + ma.food + " days of food left.");
		}

		//use part
		if (ma.badages > 0 )
		{
			p("<1> Use a bandage.");
		}
		p("<2> Exit.");

		ma.tmp = SCAN();

		switch (ma.tmp)
		{
		case 1:
			if (ma.badages > 0)
			{
				if (ma.injuries >= 1)
				{
					ma.badages --;
					ma.injuries --;
				}
				else {
					p("You have no injures to fix.");
				}
			}
		break;
		case 2:
		break;
		default:
		break;
		}

		return;
	}

	public static boolean potato()
	{
		if (ma.day == ma.fday)
		{
			return false;
		}
		else
		{
			ma.fday = ma.day;
			return true;
		}
	}

	public static String GetIng()
	{
		//prefix
		String[] aPrefix = {"Stubbed", "Broken","Mutilated", "Removed", "Depressed", "Stiff", "Bootylicious","Hemmhorraged", "Fevered", "Ruptured",
				"inverted", "Explosive", "Stuck","Perminant", "Partialy Exploded", "Shattered", "Improperley Cloned", "The", "Artificialy Inseminated",
				"Moldy", "Small", "Smallish", "Tight"};
		
		//Suffix
		String[] aSuffix = {"Toe", "Arm", "Heart", "Anus", "Armpit", "Face", "Nose", "Skin", "Brain", "Spleen", "Pagina", "Ego", "Virginity", "nipples",
				"Left Testicle", "Beard", "Right Buttcheek", "Eyes"};
		
		//Attach Prefix and suffix then return.
		String comb = getRndArr(aPrefix) + " " + getRndArr(aSuffix);
		return comb;
	}
	
	public static String getRndArr(String[] array) {
		//Gets a random from inputed array.
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
	public static boolean ded()
	{
		//If dead checker, returns true of the person has died, false if they have lived.
		if(ma.food <= 0 || ma.water <= 0 || ma.injuries >= 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void getSpecial()
	{
		//Returns and runs the special events that can occur while forrage
		
		//Get random number
		int stmp = ma.ran.nextInt(5);
		//Switch random number.
		switch (stmp)
		{
		case 0:
			//Mistery Meat +2 ing +5 food
			p("You found some mistery meat!");
			p("When you ate it you got two injuries, but gaied 5 days worth of food!");
			use(2, "ing");
			use(5, "food");
		break;
		case 1:
			//UFO gain 6 bandages, loose 2 days food and water.
			p("You were abducted by a UFO");
			p("They gave you 6 bandages, but you are down 2 days of water.");
			use(6, "bandage");
			use(-2, "water");
		break;
		case 2:
			//School childrens + 4 days of food
			p("You passed by a gathering of school children.");
			p("You gained 4 days of food.");
			use(4, "food");
		break;
		case 3:
			//Vending mashine + 1 ing + 4 water
			p("You find a vending machine.");
			p("You punch the glass to get in an get a " + GetIng());
			p("You gain an injury, but got 4 days of water.");
			use(1, "ing");
			use(4, "water");
		break;
		case 4:
			//OD on Viagra your erection last for longer than 24 hours You gain 3 inguries.
			p("You OD Viagra, it gains a mind of it's own.");
			p("You gain 3 inguries but it gets you 2 days of food and water.");
			p("Inguries:");
			p(" " + GetIng());
			p(" " + GetIng());
			p(" " + GetIng());
			use(3, "ing");
			use(2, "food");
			use(2, "water");
		}
	}
	
	public static int SCAN()
	{
		//Cleans scan input
		while (true)
		{
			//while loop prevents a wrong scan from getting imputed
			//accual scan of user input
			String tmp = ma.scan.nextLine();
			//Runs the check and gets a true or false from the Boolean
			if (ScanChecks(tmp))
			{
				//if the input is an int, change the string to an int.
				int tmp2 = Integer.parseInt(tmp);
				//Return the int
				return tmp2;
			}
			else
			{
				//Call for the user to enter a number
				p("Enter a number.");
			}
		}
	}
	public static boolean ScanChecks(String s)
	{
		//Int checks
		//Check if empty
		if (s.isEmpty()) return false;
		else 
		{
			//Check that it is not a word
			try { 
		        Integer.parseInt(s); 
		    } catch(NumberFormatException e) { 
		        return false; 
		    } catch(NullPointerException e) {
		        return false;
		    }
		    return true;
		}
	}
	public static void use(int ammount, String type)
	{
		//This uses the materials
		//It also prevents negative days worth of food or water.
		
		//Create tmp image 
		int tmp;
		//change of use type to lowercase to help prevent errors.
		type.toLowerCase();
		//Check that type exists.
		if (type.equals("water") || type.equals("food") || type.equals("ing") || type.equals("bandage"))
		{ 
			//If the type does exists switch it for the amount needed.
			switch (type)
			{
			//Water
			case "water":
				//Make new ammount.
				tmp = ma.water + ammount;
				if (tmp <= 0)
				{
					//If new is less than 0, set it to 0.
					ma.water = 0;
				}
				else
				{
					//Otherwise set the new ammount.
					ma.water = tmp;
				}
			break;
			//Inguries
			//Repeat prosses of water for all other materials.
			case "ing":
				tmp = ma.injuries + ammount;
				if (tmp <= 0)
				{
					ma.injuries = 0;
				}
				else
				{
					ma.injuries = tmp;
				}
			break;
			//Food
			case "food":
				tmp = ma.food + ammount;
				if (tmp <= 0)
				{
					ma.food = 0;
				}
				else
				{
					ma.food = tmp;
				}
			break;
			//bandages
			case "bandage":
				tmp = ma.badages + ammount;
				if (tmp <= 0)
				{
					ma.badages = 0;
				}
				else
				{
					ma.badages = tmp;
				}
			break;
			}
		}
		else{
			//If type material does not exsits return and error and end game.
			Error.trow("cd.~300, USE() ON ' " + type + " ' END%%");
		}
	}
	public static void forrItem()
	{
		//Forrage for an item.
		//Get a random number.
		int tmp = ma.ran.nextInt(15);

		//Switch random number.
		switch (tmp)
		{
		case 0:
			p("While looking for resources you got a " + GetIng());
			use(1, "ing");
		break;
		case 1:
			p("You found a day's worth of water.");
			use(1, "water");
		break;
		case 2:
			p("You found a day's worth of food.");
			use(1, "food");
		break;
		case 3:
			p("You have found a bandage.");
			use(1, "bandage");
		break;
		case 4:
			p("You have found both a days worth of water, and food.");
			use(1, "water");
			use(1, "food");
		break;
		case 5:
			p("You found nothing.");
		break;
		case 6:
			getSpecial();
			//Special events while searching.
		break;
		case 7:
			p("You found nothing.");
		break;
		case 8:
			p("You found two days worth of food.");
			use(2, "food");
		break;
		case 9:
			p("You found two days worth of water.");
			use(2, "water");
		break;
		case 10:
			p("You found two days of food and water.");
			use(2, "food");
			use(2, "water");
		break;
		case 11:
			getSpecial();
			//Special events while searching.
		break;
		case 12:
			p("You found two bandages.");
			use(2, "bandage");
		break;
		case 13:
			p("You found two bandages.");
			use(2, "bandage");
		break;
		case 14:
			p("You found two days worth of water.");
			use(2, "water");
		break;
		}
	}
	public static String treeMain()
	{
		if (ma.tree < 3 && ma.btree)
		{
			p("You arrive at a tree,");
			p("it looks very attractive...");
			ma.tree++;
		} else if (ma.tree == 3) {
			p("You meet the tree again, you decide to get married.");
			p("As a wedding gif you get 3 days of food and water.");
			use(3, "water");
			use(3, "food");
			ma.tree++;
		} else if (ma.tree > 3) {
			p("You meet your spouse tree again...");
			if (ma.ran.nextInt(4) == 0)
			{
				p("It is running into some hard times...");
				if (ma.ran.nextInt(1) == 0)
				{
					p("You give it a day's worth of water.");
					use(-1, "water");
				} else {
					p("You give it a day's worth of food.");
					use(-1, "food");
				}
			} else {
				if (ma.ran.nextInt(1) == 0){
					p("It gives you two days of food.");
					use(2, "food");
				} else {
					p("It gives you two days of water.");
					use(2, "water");
				}
			}
		}
		ma.btree = false;
		return "A Tree";
	}
	public static void cheats()
	{
		clear();
		p("Cheat Menu!!!!!!!!!");
		p("<1> Custom amount of food.");
		p("<2> Custom amount of water.");
		p("<3> Custom amount of a bandages.");
		p("<4> Exit.");
		
		switch (SCAN())
		{
		case 1:
			use(SCAN(), "food");
			
		break;
		case 2:
			use(SCAN(), "water");
		break;
		case 3:
			use(SCAN(), "bandage");
		break;
		case 4:
		break;
		default:
			cheats();
		break;
				
		}
	}
}