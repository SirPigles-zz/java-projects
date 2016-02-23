import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter("file.prr", "UTF-8");
		
		writer.println("Test One :D");
		writer.println("More test! ~~~~!");
		writer.close();
	}
}
