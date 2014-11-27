import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Code 
{
	public static ArrayList<Variable> Parse(String in) throws FileNotFoundException
	{
		File main = new File(in);
		Scanner sc = new Scanner(main);
		ArrayList<Variable> vl = new ArrayList<Variable>();
		
		while (sc.hasNext() == true)
		{
			in = sc.nextLine();
			vl.add(Detection(in));
		}
		sc.close();
		return vl;
		
	}

	public static Variable Detection(String td)
	{
		// remove "private " from string, might be interesting to add diffrent methods later on
		td = td.substring(8);
	
		String TypeDetected = TypeDetection(td);
												// removes all whitespace
		td = td.substring(TypeDetected.length()).replaceAll("\\s+","");
		Variable vars = new Variable(TypeDetected, VarDetection(td));
		return vars;
	}
	
	public static String VarDetection(String input)
	{
		String var = "";
		int c = 0;
		while (input.charAt(c) != ';')
		{
			var += input.charAt(c);
			c++;
		}
		return var;
	}
	
	public static String TypeDetection(String input)
	{
		String type = "";
		int c = 0;
		while (input.charAt(c) != ' ')
		{
			type += input.charAt(c);
			c++;
		}
		return type;
	}
}
