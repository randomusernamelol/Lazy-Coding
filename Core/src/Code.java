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
		
		return vl;
	}

	public static Variable Detection(String td)
	{
		// remove "private " from string, might be interesting to add diffrent methods later on
		td = td.substring(8);
	
		String TypeDetected = TypeDetection(td);
		// String
		if (TypeDetected.equals("String"))
		{
			//remove "String "
			td = td.substring(7);

			System.out.println(VarDetection(td));
			Variable String = new Variable("String", VarDetection(td));
			
			return String;
		}
		
		// int
		if (TypeDetected.equals("int"))
		{
			// remove "int "
			td = td.substring(4);
			Variable Int = new Variable("int", VarDetection(td));
			
			System.out.println(VarDetection(td));
			return Int;
		}
				
				
		Variable empty = new Variable("error", "error");
		return empty;
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
