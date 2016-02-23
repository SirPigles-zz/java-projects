import java.util.*;

public class main {

	public static Scanner scan = new Scanner(System.in);

	public static String name, stmp;
	public static int tmp;
	
	public static void main(String[] args) {
		start();
	}
	public static void p(String text)
	{
		System.out.println(text);
	}
	public static void start()
	{
		p("WHELCOME TO THE BEST TEXT ADVVENTUERI THUEAUHJINIAKSSDANKJ!!!! ;)");
		p("NAME, GO!");
		name = scan.nextLine();
		p("YOU, " + name + " MUST FIND THE GREAT AND MYTHICAL POTATO!");
		p("YOU AWAKE IN A HOSPITAL, YOUR ASS HURTS.");
		p("WHAT DO YOU DO??!?!?!?!?!!?!!!??!??!?!!!?!!!?!");
		p("");
		hos();
	}
	public static void hos()
	{
		p("<1> LOOK FOR A DOCTOR!");
		p("<2> ACT IN PAIN TO GET SUM OF DAT MORPHIME!");
		p("<3> WALK OUT.");
		tmp = scan.nextInt();

		switch (tmp)
		{
			case 1:
				p("DUDE, NO ONE IS HERE.");
				p("");
				hos();
			break;
			case 2:
				p("DUUUUUUUDE");
				p("");
				hos();
			break;
			case 3:
				p("DUDE, NO.");
				p("");
				hos();
			break;
			default:
				p("");
				hos();
			break;
		}
	}
}
